package com.metaxiii.fr.craft;

import java.util.Map;

public class MoveForwardStrategyFactory implements ExecuteStrategyFactory {

  private final Map<String, ExecuteStrategy> executeStrtegies;

  public MoveForwardStrategyFactory() {
    executeStrtegies =
      Map.of(
        "N",
        new MoveNorthStrategy(),
        "S",
        new MoveSouthStrategy(),
        "E",
        new MoveEastStrategy(),
        "W",
        new MoveWestStrategy()
      );
  }

  @Override
  public ExecuteStrategy of(final String direction) {
    return executeStrtegies.get(direction);
  }
}
