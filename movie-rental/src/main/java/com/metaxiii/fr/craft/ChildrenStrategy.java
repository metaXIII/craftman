package com.metaxiii.fr.craft;

public class ChildrenStrategy implements RentalStrategy {

  @Override
  public double calculateAmount(final int daysRented) {
    double amount = 1.5;
    if (daysRented >= 4) {
      amount += (daysRented - 3) * 1.5;
    }
    return amount;
  }

  @Override
  public int calculateFrequentRenterPoints(final int daysRented) {
    return 1;
  }
}
