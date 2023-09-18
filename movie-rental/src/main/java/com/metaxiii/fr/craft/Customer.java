package com.metaxiii.fr.craft;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  public record Tape(String serialNumber, Movie movie) {}

  public record Rental(Tape tape, int daysRented) {}

  private record RentalDetail(Rental rental, double amount, int frequentRenterPoints) {}

  public record Movie(String name, int priceCode) {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
  }

  private final String name;
  private final List<Rental> rentals;

  private final RentalStrategyFactory rentalStrategyFactory;

  public Customer(final String name) {
    this.name = name;
    this.rentals = new ArrayList<>();
    this.rentalStrategyFactory = new RentalStrategyFactory();
  }

  public String statement() {
    final var rentalDetails = calculateRentalDetails();
    final double totalAmount = calculateTotalAmount(rentalDetails);
    final int totalRenterPoints = calculateFrequentRenterPoints(rentalDetails);
    return generateReport(rentalDetails, totalAmount, totalRenterPoints);
  }

  private String generateReport(
    final List<RentalDetail> rentalDetails,
    final double totalAmount,
    final int totalRenterPoints
  ) {
    final StringBuilder result = new StringBuilder(getStatementHeader());
    for (final var rentalDetail : rentalDetails) {
      result.append(buildRentalMessage(rentalDetail.rental.tape().movie().name(), rentalDetail.amount));
    }
    result.append(getStatementFooter(totalAmount, totalRenterPoints));
    return result.toString();
  }

  private static int calculateFrequentRenterPoints(final List<RentalDetail> rentalDetails) {
    int frequentRenterPoints = 0;
    for (final var rentalDetail : rentalDetails) {
      frequentRenterPoints += rentalDetail.frequentRenterPoints;
    }
    return frequentRenterPoints;
  }

  private static double calculateTotalAmount(final List<RentalDetail> rentalDetails) {
    double totalAmount = 0;
    for (final var rentalDetail : rentalDetails) {
      totalAmount += rentalDetail.amount;
    }
    return totalAmount;
  }

  private List<RentalDetail> calculateRentalDetails() {
    return rentals
      .stream()
      .map(rental -> new RentalDetail(rental, calculateRentalAmount(rental), getFrequentRenterPoints(rental)))
      .toList();
  }

  private double calculateRentalAmount(final Rental rental) {
    return rentalStrategyFactory.of(rental.tape().movie().priceCode()).calculateAmount(rental.daysRented());
  }

  private String buildRentalMessage(final String name, final double amount) {
    return "\t" + name + "\t" + amount + "\n";
  }

  private int getFrequentRenterPoints(final Rental rental) {
    return rentalStrategyFactory
      .of(rental.tape().movie().priceCode())
      .calculateFrequentRenterPoints(rental.daysRented());
  }

  private static String getStatementFooter(final double totalAmount, final int frequentRenterPoints) {
    return "Amount owed is " + totalAmount + "\n" + "You earned " + frequentRenterPoints + " frequent renter points";
  }

  private String getStatementHeader() {
    return "Rental Record for " + name() + "\n";
  }

  private String name() {
    return name;
  }

  public void addRental(final Rental rental) {
    rentals.add(rental);
  }
}
