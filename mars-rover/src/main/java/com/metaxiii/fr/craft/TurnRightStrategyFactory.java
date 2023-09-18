package com.metaxiii.fr.craft;

import java.util.Map;

public class TurnRightStrategyFactory implements ExecuteStrategyFactory {

  private final Map<String, ExecuteStrategy> turnStrategies;

  public TurnRightStrategyFactory() {
    turnStrategies =
      Map.of(
        "N",
        new FaceEastStrategy(),
        "S",
        new FaceWestStrategy(),
        "E",
        new FaceSouthStrategy(),
        "W",
        new FaceNorthStrategy()
      );
  }

  @Override
  public ExecuteStrategy of(final String direction) {
    return turnStrategies.get(direction);
  }
}
