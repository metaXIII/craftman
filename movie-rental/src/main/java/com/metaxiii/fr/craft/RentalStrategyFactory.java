package com.metaxiii.fr.craft;

import java.util.Map;

public class RentalStrategyFactory {

  private final Map<Integer, RentalStrategy> rentalAmountStrategyMap;

  public RentalStrategyFactory() {
    this.rentalAmountStrategyMap =
      Map.of(
        Customer.Movie.REGULAR,
        new RegularStrategy(),
        Customer.Movie.NEW_RELEASE,
        new NewReleaseStrategy(),
        Customer.Movie.CHILDRENS,
        new ChildrenStrategy()
      );
  }

  public RentalStrategy of(final int i) {
    return this.rentalAmountStrategyMap.get(i);
  }
}
