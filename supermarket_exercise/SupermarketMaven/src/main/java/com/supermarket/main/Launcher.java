package com.supermarket.main;

import com.supermarket.implementation.CashierDeskImpl;
import com.supermarket.implementation.OfferCatalogueImpl;
import com.supermarket.implementation.ShoppingCartImpl;
import com.supermarket.interfaces.CashierDesk;
import com.supermarket.interfaces.OfferCatalogue;
import com.supermarket.interfaces.ShoppingCart;
import com.supermarket.models.Item;
import com.supermarket.models.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by horiav on 26/12/2015.
 */
public class Launcher
{
    public String runApp( String[] args )
    {
        OfferCatalogue offerCatalogue = getOfferCatalogue();

        ShoppingCart shoppingCart = getShoppingCart( args );

        CashierDesk cashierDesk = getCashierDesk( shoppingCart, offerCatalogue );

        double totalValue = cashierDesk.calculateTotal();

        System.out.print("---------------------" + "Total is: ");
        System.out.print(totalValue);
        System.out.print("---------------------");

        return "Total value of shopping is: " + totalValue;
    }

    private CashierDesk getCashierDesk( ShoppingCart shoppingCart, OfferCatalogue offerCatalogue )
    {
        CashierDesk cashierDesk = new CashierDeskImpl();
        cashierDesk.addOfferCatalogue( offerCatalogue );
        cashierDesk.addShoppingCart( shoppingCart );
        return cashierDesk;
    }

    private OfferCatalogue getOfferCatalogue()
    {
        OfferCatalogue offerCatalogue = new OfferCatalogueImpl();
        offerCatalogue.addNewOffer( new Offer( "A", 2, 3.00 ));
        offerCatalogue.addNewOffer( new Offer( "B", 3, 3.50 ));
        return offerCatalogue;
    }

    private ShoppingCart getShoppingCart( String[] units )
    {
        List<Item> itemList = new ArrayList<>();
        itemList.add( new Item( "A", 2.00 ));
        itemList.add( new Item( "B", 1.50 ));
        itemList.add( new Item( "C", 1.25 ));
        itemList.add( new Item( "D", 1.00 ));

        Random randInt = new Random();
        ShoppingCart shoppingCart = new ShoppingCartImpl();

        for ( Item item:itemList )
        {
            int numberOfUnits;

            Integer randomFlag = Integer.valueOf( units[0] );
            Integer bound = Integer.valueOf( units[1] );

            if ( randomFlag == 1 )
            {
                numberOfUnits = randInt.nextInt( bound );
            }
            else
            {
                numberOfUnits = bound;
            }

            for ( int unit=0; unit < numberOfUnits; unit ++ )
            {
                shoppingCart.addItem( item );
            }

        }
        return shoppingCart;
    }
}
