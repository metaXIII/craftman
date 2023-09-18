package com.metaxiii.fr.craft;

import java.util.Map;

public class TurnLeftStrategyFactory implements ExecuteStrategyFactory {

  private final Map<String, ExecuteStrategy> turnStrategies;

  public TurnLeftStrategyFactory() {
    turnStrategies =
      Map.of(
        "N",
        new FaceWestStrategy(),
        "S",
        new FaceEastStrategy(),
        "E",
        new FaceNorthStrategy(),
        "W",
        new FaceSouthStrategy()
      );
  }

  @Override
  public ExecuteStrategy of(final String direction) {
    return turnStrategies.get(direction);
  }
}
