package com.supermarket.models;

import java.util.Objects;

/**
 * Created by horiav on 25/12/2015.
 */
public class Item
{
    private final String itemName;
    private final double itemPrice;

    public Item( final String itemName, final double itemPrice )
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName()
    {
        return itemName;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    @Override
    public final boolean equals(Object obj)
    {
        if ( obj == null ) return false;
        if ( ! ( obj instanceof Item ) ) return false;

        String itemName = ( (Item) obj ).getItemName();
        double itemPrice = ( (Item) obj ).getItemPrice();

        if ( ! ( this.getItemName().equals( itemName ) ) ) return false;
        if ( ( Double.compare( this.getItemPrice(), itemPrice ) ) != 0 ) return false;

        return true;
    }

    @Override
    public final int hashCode()
    {
        return Objects.hash(this.itemName, this.itemPrice);
    }
}
