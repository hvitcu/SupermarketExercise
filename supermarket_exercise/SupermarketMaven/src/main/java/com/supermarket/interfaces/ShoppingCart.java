package com.supermarket.interfaces;

import com.supermarket.models.Item;

import java.util.List;

/**
 * The shopping cart only cares and knows about what Items it holds.
 *
 */
public interface ShoppingCart
{
    /**
     * Add new item to the shopping cart
     * @param item the item
     */
    void addItem( Item item );

    /**
     * Add list of items to the shopping cart
     * @param items the list of items
     */
    void addItems( List<Item> items );

    /**
     * Get the itemList
     * @return Returns the item list.
     */
    List<Item> getItemList();
}
