package com.thoughtworks.movierental;

public class NewReleasePriceCode implements PriceCode {

    public static final int PRICE_PER_DAY = 3;

    public double amountFor(int daysRented) {
        return daysRented * PRICE_PER_DAY;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return BONUS_RENTAL_POINTS;
        return DEFAULT_RENTAL_POINTS;
    }
}
