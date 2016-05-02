package com.supermarket.implementation;

import com.supermarket.common.CommonUtils;
import com.supermarket.interfaces.ShoppingCart;
import com.supermarket.models.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by horiav on 25/12/2015.
 */
public class ShoppingCartTest
{
    private ShoppingCart testShoppingCart;

    @Before
    public void setup()
    {
        testShoppingCart = new ShoppingCartImpl();
    }

    @Test
    public void testAddItemGetList()
    {
        List<Item> itemsList = CommonUtils.getUnitTestItems();
        testShoppingCart.addItems( itemsList );
        assertEquals( "Test Item List", testShoppingCart.getItemList(), itemsList );
    }

    @Test
    public void testAddItemsGetList()
    {
        List<Item> itemsList = CommonUtils.getUnitTestItems();
        Item justOneItem = itemsList.get( 0 );
        testShoppingCart.addItem( justOneItem );
        assertEquals( "Test Item List", justOneItem, testShoppingCart.getItemList().get( 0 ) );
    }
}
