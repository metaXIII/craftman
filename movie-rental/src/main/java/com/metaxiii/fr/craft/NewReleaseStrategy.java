package com.metaxiii.fr.craft;

public class NewReleaseStrategy implements RentalStrategy {

  @Override
  public double calculateAmount(final int daysRented) {
    return daysRented * 3;
  }

  @Override
  public int calculateFrequentRenterPoints(final int daysRented) {
    return 0;
  }
}
