package com.metaxiii.fr.craft;

public interface RentalStrategy {
  double calculateAmount(int daysRented);
  int calculateFrequentRenterPoints(int daysRented);
}
