package com.supermarket.implementation;

import com.supermarket.interfaces.CashierDesk;
import com.supermarket.interfaces.OfferCatalogue;
import com.supermarket.interfaces.ShoppingCart;
import com.supermarket.models.Item;
import com.supermarket.models.Offer;

import java.util.*;

/**
 * Created by horiav on 25/12/2015.
 */
public class CashierDeskImpl implements CashierDesk
{
    ShoppingCart shoppingCart = null;
    OfferCatalogue offerCatalogue = new OfferCatalogueImpl();

    @Override
    public void addOfferCatalogue( final OfferCatalogue offerCatalogue )
    {
        this.offerCatalogue = offerCatalogue;
    }

    @Override
    public void addShoppingCart( final ShoppingCart shoppingCart )
    {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public double calculateTotal()
    {
        Set<Item> distinctItems = new HashSet<>();
        Map<String, Offer> offerItemNamesMap = new HashMap<>();

        if ( shoppingCart != null )
        {
            List<Item> itemList = shoppingCart.getItemList();
            itemList.forEach(item -> distinctItems.add( item ));
            return totalOfferAndNoOffer( itemList, offerCatalogue.getAllOffers(),
                    distinctItems, offerItemNamesMap );
        }
        System.out.print( "No items in the shopping cart" );
        return 0;
    }

    private double totalOfferAndNoOffer( List<Item> items,
                                        List<Offer> offers,
                                        Set<Item> distinctItems,
                                        Map<String, Offer> offerItemNamesMap )
    {
        double totalOffer = 0.00;
        double totalNoOffer = 0.00;
        offers.forEach( offer -> offerItemNamesMap.put( offer.getItemName(), offer ) );

        for ( Item distItem: distinctItems )
        {
            String itemName = distItem.getItemName();
            int item_count = Collections.frequency( items, distItem ) ;

            if ( offerItemNamesMap.containsKey( itemName ) )
            {
                Offer offer = offerItemNamesMap.get( itemName );
                int num_req = offer.getNumRequired();
                totalOffer += item_count / num_req * offer.getOfferPrice();
                totalOffer += item_count % num_req * distItem.getItemPrice();
            }
            else
            {
                totalNoOffer += item_count * distItem.getItemPrice();
            }
        }
        return totalOffer + totalNoOffer;
    }
}
