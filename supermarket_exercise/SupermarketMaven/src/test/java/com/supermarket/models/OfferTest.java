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
public class OfferTest
{
    public static final String TEST_OFFER_ITEM_NAME = "Test Item";
    public static final int  TEST_OFFER_NUM_REQ = 5;
    public static final double TEST_OFFER_PRICE = 999;
    private Offer testOffer;

    @Before
    public void setup()
    {
        testOffer = new Offer( TEST_OFFER_ITEM_NAME, TEST_OFFER_NUM_REQ, TEST_OFFER_PRICE );
    }

    @Test
    public void testGetOfferItemName()
    {
        assertEquals( "Test Offer Item Name", TEST_OFFER_ITEM_NAME, testOffer.getItemName() );
    }

    @Test
    public void testGetOfferNumReq()
    {
        assertEquals( "Test Offer Number Required", TEST_OFFER_NUM_REQ, testOffer.getNumRequired() );
    }
    @Test
    public void testGetOfferPrice()
    {
        assertEquals( "Test Offer Price", TEST_OFFER_PRICE, testOffer.getOfferPrice(), 0.1 );
    }

    @Test
    public void testEqualsAndHashCode()
    {
        EqualsVerifier.forClass( Offer.class )
                .suppress( Warning.NONFINAL_FIELDS, Warning.NULL_FIELDS )
                .verify();
    }
}
