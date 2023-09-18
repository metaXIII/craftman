package com.metaxiii.fr.craft;

public class DefaultUpdateStrategy implements UpdateStrategy {

  @Override
  public void updateItem(final Item item) {
    if (item.quality > 0) {
      item.quality--;
    }
    item.sellIn--;
    if (item.sellIn < 0) {
      if (item.quality > 0) {
        item.quality--;
      }
    }
  }
}
