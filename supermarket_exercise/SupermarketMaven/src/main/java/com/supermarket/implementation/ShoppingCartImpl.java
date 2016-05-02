package com.supermarket.implementation;

import com.supermarket.interfaces.ShoppingCart;
import com.supermarket.models.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by horiav on 25/12/2015.
 */
public class ShoppingCartImpl implements ShoppingCart
{
    List<Item> itemsList;

    public ShoppingCartImpl()
    {
        itemsList = new ArrayList<>();
    }

    @Override
    public void addItem( final Item item )
    {
        itemsList.add( item );
    }

    @Override
    public void addItems( final List<Item> items )
    {
        itemsList.addAll( items );
    }

    @Override
    public List<Item> getItemList()
    {
        return itemsList;
    }
}
