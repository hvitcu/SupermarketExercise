package com.supermarket.models;

import java.util.Objects;

/**
 * Created by horiav on 25/12/2015.
 */
public class Offer
{
    private String itemName;
    private int numRequired;
    private double offerPrice;

    public Offer( final String itemName, final int numRequired, final double offerPrice )
    {
        this.itemName = itemName;
        this.numRequired = numRequired;
        this.offerPrice = offerPrice;
    }

    public String getItemName()
    {
        return itemName;
    }

    public int getNumRequired()
    {
        return numRequired;
    }

    public double getOfferPrice()
    {
        return offerPrice;
    }

    @Override
    public final boolean equals( Object obj )
    {
        if ( obj == null ) return false;
        if ( ! ( obj instanceof Offer ) ) return false;

        String itemName = ( (Offer) obj ).getItemName();
        int numRequired = ( (Offer) obj ).getNumRequired();
        double offerPrice = ( (Offer) obj ).getOfferPrice();

        if ( ! ( this.getItemName().equals( itemName ) ) ) return false;
        if ( ( Integer.compare( this.getNumRequired(), numRequired ) != 0 ) ) return false;
        if ( ( Double.compare( this.getOfferPrice(), offerPrice ) ) != 0 ) return false;

        return true;
    }

    @Override
    public final int hashCode()
    {
        return Objects.hash( this.itemName, this.numRequired, this.offerPrice );
    }
}
