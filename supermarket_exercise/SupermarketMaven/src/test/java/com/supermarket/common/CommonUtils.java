package com.supermarket.common;

import com.supermarket.models.Item;
import com.supermarket.models.Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by horiav on 25/12/2015.
 */
public class CommonUtils
{
    public static List<Offer> getUnitTestOffers()
    {
        List<Offer> offerList = new ArrayList<>();
        offerList.add( new Offer("TEST_A", 2, 2) );
        offerList.add( new Offer("TEST_B", 2, 2) );
        return offerList;
    }

    public static List<Item> getUnitTestItems()
    {
        List<Item> itemsList = new ArrayList<>();
        itemsList.add( new Item("TEST_A", 1.50) );
        itemsList.add( new Item("TEST_B", 1.50) );
        itemsList.add( new Item("TEST_B", 1.50) );
        itemsList.add( new Item("TEST_C", 1.50) );
        itemsList.add( new Item("TEST_D", 1.50) );
        itemsList.add( new Item("TEST_A", 1.50) );
        itemsList.add( new Item("TEST_A", 1.50) );
        return itemsList;
    }

    public static List<Item> getItemList( int units, String itemName, String itemPrice )
    {
        List<Item> itemList = new ArrayList<>();
        Item testItem = new Item( itemName, Double.valueOf( itemPrice ) );
        for (int i = 0; i < units; i++)
        {
            itemList.add( testItem );
        }
        return itemList;
    }

}
