package com.metaxiii.fr.craft;

public class RegularStrategy implements RentalStrategy {

  @Override
  public double calculateAmount(final int daysRented) {
    double amount = 2;

    if (daysRented >= 3) {
      amount += (daysRented - 2) * 1.5;
    }

    return amount;
  }

  @Override
  public int calculateFrequentRenterPoints(final int daysRented) {
    return 1;
  }
}
