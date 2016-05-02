package com.supermarket.models;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by horiav on 25/12/2015.
 */
public class ItemTest
{

    public static final String TEST_ITEM_NAME = "Test Item";
    public static final double TEST_ITEM_PRICE = 999.50;
    private Item testItem;

    @Before
    public void setup()
    {
        testItem = new Item(TEST_ITEM_NAME, TEST_ITEM_PRICE);
    }

    @Test
    public void testGetItemName()
    {
        assertEquals( "Test Item Name", TEST_ITEM_NAME, testItem.getItemName() );
    }

    @Test
    public void testGetItemPrice()
    {
        assertEquals( "Test Item Price",TEST_ITEM_PRICE, testItem.getItemPrice(), 0.1 );
    }

    @Test
    public void testEqualsAndHashCode()
    {
        EqualsVerifier.forClass( Item.class )
                .suppress( Warning.NONFINAL_FIELDS, Warning.NULL_FIELDS )
                .verify();
    }
}
