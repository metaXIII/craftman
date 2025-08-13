package com.metaxiii.fr.craft;

import java.util.Arrays;

public class GildedRose {

  private final Item[] items;
  private final UpdateStrategyFactory updateStrategyFactory;

  public GildedRose(final Item[] items) {
    this.items = items;
    this.updateStrategyFactory = new UpdateStrategyFactory();
  }

  public void updateQuality() {
    Arrays.stream(items).forEach(item -> this.updateStrategyFactory.of(item).updateItem(item));
  }
}
