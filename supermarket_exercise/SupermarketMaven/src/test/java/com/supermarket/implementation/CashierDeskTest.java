package com.supermarket.implementation;

import com.supermarket.common.CommonUtils;
import com.supermarket.interfaces.CashierDesk;
import com.supermarket.interfaces.OfferCatalogue;
import com.supermarket.interfaces.ShoppingCart;
import com.supermarket.models.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by horiav on 25/12/2015.
 */
public class CashierDeskTest
{
    private CashierDesk testCashierDesk;
    private List<Item> testItems = CommonUtils.getUnitTestItems();

    @Before
    public void setup()
    {
        testCashierDesk = new CashierDeskImpl();
    }

    @Test
    public void testCalculateTotal()
    {
        // with and offer of 2x for 2.00 for As and Bs
        // 3xA@1.50each, 2xB@1.50each, 1xC@1.50,1xD@1.50 must equal 8.50

        OfferCatalogue testOfferCatalogue = new OfferCatalogueImpl();
        testOfferCatalogue.addNewOffers( CommonUtils.getUnitTestOffers() );

        ShoppingCart testShoppingCart = new ShoppingCartImpl();
        testShoppingCart.addItems( CommonUtils.getUnitTestItems() );

        testCashierDesk.addOfferCatalogue( testOfferCatalogue );
        testCashierDesk.addShoppingCart( testShoppingCart );

        double total = testCashierDesk.calculateTotal();
        assertEquals( "Test Calculate Total", 8.50, total, 0.1);

        testCashierDesk = new CashierDeskImpl();
        double totalZero = testCashierDesk.calculateTotal();
        assertEquals( "Test Calculate Total is Zero", 0.0, totalZero, 0.1);
    }
}
