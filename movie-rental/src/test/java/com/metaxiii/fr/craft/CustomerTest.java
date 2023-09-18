package com.metaxiii.fr.craft;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

  private Customer customer;

  @BeforeEach
  public void beforeEach() {
    customer = new Customer("Scott");
  }

  @AfterEach
  public void afterEach() {
    customer = null;
  }

  @Test
  void itShouldCallCustomerConstructor() {
    assertDoesNotThrow(() -> customer);
  }

  @Test
  void givenNewCustomerWhenStatementThenReturnDefaultValue() {
    //given
    //when
    final var expected =
      """
                Rental Record for Scott
                Amount owed is 0.0
                You earned 0 frequent renter points""";
    //then
    assertEquals(expected, customer.statement());
  }

  @Test
  void givenCustomerRegularWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.REGULAR, 20, "Saw");
    final var expected =
      """
                Rental Record for Scott
                	Saw	29.0
                Amount owed is 29.0
                You earned 1 frequent renter points""";
    //when
    final var result = customer.statement();
    //then
    assertEquals(expected, result);
  }

  @Test
  void givenCustomerRegular3DaysWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.REGULAR, 3, "Saw");
    final var expected =
      """
                Rental Record for Scott
                \tSaw\t3.5
                Amount owed is 3.5
                You earned 1 frequent renter points""";
    //when
    final String result = customer.statement();
    //then
    assertEquals(expected, result);
  }

  @Test
  void givenCustomerNewRelease20DaysWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.NEW_RELEASE, 20, "Saw");
    //when
    final var expected =
      """
                Rental Record for Scott
                \tSaw\t60.0
                Amount owed is 60.0
                You earned 0 frequent renter points""";
    //then
    assertEquals(expected, customer.statement());
  }

  @Test
  void givenCustomerNewRelease1DayWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.NEW_RELEASE, 1, "Saw");
    //when
    final var expected =
      """
                Rental Record for Scott
                \tSaw\t3.0
                Amount owed is 3.0
                You earned 0 frequent renter points""";
    //then
    assertEquals(expected, customer.statement());
  }

  @Test
  void givenCustomerChildrenWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.CHILDRENS, 10, "Saw");
    //when
    final var expected =
      """
                Rental Record for Scott
                \tSaw\t12.0
                Amount owed is 12.0
                You earned 1 frequent renter points""";
    //then
    assertEquals(expected, customer.statement());
  }

  @Test
  void givenCustomerChildren4DaysWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.CHILDRENS, 4, "Saw");
    //when
    final var expected =
      """
                Rental Record for Scott
                \tSaw\t3.0
                Amount owed is 3.0
                You earned 1 frequent renter points""";
    //then
    assertEquals(expected, customer.statement());
  }

  @Test
  void givenCustomerManyRentalsWhenStatementThenReturnStatement() {
    //given
    createRental(Customer.Movie.CHILDRENS, 4, "DORA");
    createRental(Customer.Movie.NEW_RELEASE, 4, "Openheimer");
    createRental(Customer.Movie.REGULAR, 4, "Hunger games");
    //when
    final var expected =
      """
                Rental Record for Scott
                	DORA	3.0
                	Openheimer	12.0
                	Hunger games	5.0
                Amount owed is 20.0
                You earned 2 frequent renter points""";
    //then
    assertEquals(expected, customer.statement());
  }

  private void createRental(final int priceCode, final int daysRented, final String movieName) {
    final Customer.Movie movie = new Customer.Movie(movieName, priceCode);
    final Customer.Tape tape = new Customer.Tape("serialNumber", movie);
    final Customer.Rental rental = new Customer.Rental(tape, daysRented);
    customer.addRental(rental);
  }
}
