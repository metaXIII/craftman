package com.metaxiii.fr.craft;

import java.util.Map;

public class UpdateStrategyFactory {

  Map<String, UpdateStrategy> updateStrategiesMap;
  UpdateStrategy defaultUpdateStrategy;

  public UpdateStrategyFactory() {
    this.updateStrategiesMap =
      Map.of(
        "Aged Brie",
        new AgedBrieUpdateStrategy(),
        "Backstage passes to a TAFKAL80ETC concert",
        new BackstagePassUpdateStrategy(),
        "Sulfuras, Hand of Ragnaros",
        new SulfurasUpdateStrategy()
      );
    this.defaultUpdateStrategy = new DefaultUpdateStrategy();
  }

  public UpdateStrategy of(final Item item) {
    return this.updateStrategiesMap.getOrDefault(item.name, defaultUpdateStrategy);
  }
}
