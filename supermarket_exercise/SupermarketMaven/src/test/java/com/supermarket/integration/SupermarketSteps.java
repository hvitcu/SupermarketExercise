package com.supermarket.integration;

import com.supermarket.common.CommonUtils;
import com.supermarket.implementation.CashierDeskImpl;
import com.supermarket.implementation.OfferCatalogueImpl;
import com.supermarket.implementation.ShoppingCartImpl;
import com.supermarket.interfaces.CashierDesk;
import com.supermarket.interfaces.OfferCatalogue;
import com.supermarket.interfaces.ShoppingCart;
import com.supermarket.models.Item;
import com.supermarket.models.Offer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

import java.util.List;


/**
 * Created by horiav on 26/12/2015.
 */

public class SupermarketSteps
{
    ShoppingCart testShoppingCart = new ShoppingCartImpl();
    OfferCatalogue testOfferCatalogue = new OfferCatalogueImpl();
    CashierDesk cashierDesk = new CashierDeskImpl();

    @Given( "^there are (\\d+) of \"([^\"]*)\" that costs \"([^\"]*)\"$" )
    public void there_are_of_that_costs( int units, String itemName, String itemPrice )
            throws Throwable
    {
        List<Item> itemList = CommonUtils.getItemList( units, itemName, itemPrice );
        testShoppingCart.addItems( itemList );
    }

    @And( "^there is an offer for \"([^\"]*)\" for (\\d+) units the cost is \"([^\"]*)\"$" )
    public void there_is_an_offer_for_units_the_cost_is( String itemName, int numReq, String offerPrice )
            throws Throwable
    {
        testOfferCatalogue.addNewOffer( new Offer( itemName, numReq, Double.valueOf( offerPrice ) ) );
    }

    @Then( "^the total should come up to \"([^\"]*)\"$" )
    public void the_total_should_come_up_to( String expectedTotalPrice ) throws Throwable
    {
        cashierDesk.addOfferCatalogue( testOfferCatalogue );
        cashierDesk.addShoppingCart( testShoppingCart );
        double calculateTotal = cashierDesk.calculateTotal();
        assertEquals( Double.valueOf( expectedTotalPrice ), calculateTotal, 0.1 );
    }
}