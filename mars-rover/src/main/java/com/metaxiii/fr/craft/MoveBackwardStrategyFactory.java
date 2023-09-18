package com.metaxiii.fr.craft;

import java.util.Map;

public class MoveBackwardStrategyFactory implements ExecuteStrategyFactory {

  private final Map<String, ExecuteStrategy> moveStrategies;

  public MoveBackwardStrategyFactory() {
    moveStrategies =
      Map.of(
        "N",
        new MoveSouthStrategy(),
        "S",
        new MoveNorthStrategy(),
        "E",
        new MoveWestStrategy(),
        "W",
        new MoveEastStrategy()
      );
  }

  @Override
  public ExecuteStrategy of(final String direction) {
    return moveStrategies.get(direction);
  }
}
