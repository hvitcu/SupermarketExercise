package com.supermarket.interfaces;

import com.supermarket.models.Offer;

import java.util.List;

/**
 * The Cashier Desk knows about the offers and applies them when items get scanned
 */
public interface OfferCatalogue
{
    /**
     * Add a new offer to the system
     * @param offer the offers to be added
     */
    void addNewOffer( Offer offer );

    /**
     * Add new list of offers
     * @param offers list of offers
     */
    void addNewOffers( List<Offer> offers );

    /**
     * Get all the offers available
     * @return List of all offers
     */
    List<Offer> getAllOffers();
}
