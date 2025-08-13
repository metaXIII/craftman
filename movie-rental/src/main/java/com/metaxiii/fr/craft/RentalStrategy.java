package com.metaxiii.fr.craft;

public interface RentalStrategy {
  double calculateAmount(int daysRented);

  @SuppressWarnings("unused")
  int calculateFrequentRenterPoints(int daysRented);
}
