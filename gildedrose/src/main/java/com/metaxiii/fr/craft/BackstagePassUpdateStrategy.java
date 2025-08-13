package com.metaxiii.fr.craft;

public class BackstagePassUpdateStrategy implements UpdateStrategy {

  @Override
  public void updateItem(final Item item) {
    if (item.getQuality() < 50) {
      item.setQuality(item.getQuality() + 1);
      if (item.getSellIn() < 11) {
        if (item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);
        }
      }
      if (item.getSellIn() < 6) {
        if (item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);
        }
      }
    }
    item.setSellIn(item.getSellIn() - 1);
    if (item.getSellIn() < 0) {
      item.setQuality(0);
    }
  }
}
