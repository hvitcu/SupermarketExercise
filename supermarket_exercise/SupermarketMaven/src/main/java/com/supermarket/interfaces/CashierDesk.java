package com.supermarket.interfaces;

import com.supermarket.models.Item;

import java.util.List;

/**
 * Created by horiav on 25/12/2015.
 */
public interface CashierDesk
{
    /**
     * Add offers
     * @param offerCatalogue the offer catalogue
     */
    void addOfferCatalogue( OfferCatalogue offerCatalogue );

    /**
     * Add shopping cart
     * @param shoppingCart the shopping cart
     */
    void addShoppingCart( ShoppingCart shoppingCart );

    /**
     * Calculate the total value of the shopping.
     * @return total value of the shopping.
     */
    double calculateTotal();
}
