package com.metaxiii.fr.craft;

public class AgedBrieUpdateStrategy implements UpdateStrategy {

  @Override
  public void updateItem(final Item item) {
    if (item.quality < 50) {
      item.quality++;
    }
    item.sellIn--;
    if (item.sellIn < 0) {
      if (item.quality < 50) {
        item.quality++;
      }
    }
  }
}
