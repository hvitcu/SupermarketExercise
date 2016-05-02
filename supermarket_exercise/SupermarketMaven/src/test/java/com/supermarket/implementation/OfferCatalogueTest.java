package com.supermarket.implementation;

import com.supermarket.common.CommonUtils;
import com.supermarket.interfaces.OfferCatalogue;
import com.supermarket.models.Offer;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by horiav on 25/12/2015.
 */
public class OfferCatalogueTest
{
    private OfferCatalogue testOfferCatalogue;

    @Before
    public void setup()
    {
        testOfferCatalogue = new OfferCatalogueImpl();
    }

    @Test
    public void testAddNewOfferGetOfferList()
    {
        List<Offer> offerList = CommonUtils.getUnitTestOffers();
        testOfferCatalogue.addNewOffers( offerList );
        assertEquals( "Test Offer Catalogue AddNewOfferList", offerList, testOfferCatalogue.getAllOffers() );
    }

    @Test
    public void testAddNewOffer()
    {
        List<Offer> offerList = CommonUtils.getUnitTestOffers();
        Offer justOneOffer = offerList.get( 0 );
        testOfferCatalogue.addNewOffer( justOneOffer );
        assertEquals( "Test Offer Catalogue AddNewOffer", justOneOffer, testOfferCatalogue.getAllOffers().get( 0 ) );
    }
}
