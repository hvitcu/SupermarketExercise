package com.supermarket.implementation;

import com.supermarket.interfaces.OfferCatalogue;
import com.supermarket.models.Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by horiav on 25/12/2015.
 */
public class OfferCatalogueImpl implements OfferCatalogue
{
    List<Offer> offersList;

    public OfferCatalogueImpl()
    {
        offersList = new ArrayList<>();
    }

    @Override
    public void addNewOffer( final Offer offer )
    {
        offersList.add( offer );
    }

    public void addNewOffers( final List<Offer> offers )
    {
        offersList.addAll( offers );
    }

    @Override
    public List<Offer> getAllOffers()
    {
        return offersList;
    }
}
