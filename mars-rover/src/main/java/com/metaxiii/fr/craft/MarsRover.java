package com.metaxiii.fr.craft;

import java.util.Map;

public class MarsRover {

  private String orientation;
  private Integer y;
  private Integer x;

  public Integer getY() {
    return y;
  }

  public Integer getX() {
    return x;
  }

  public void setY(final Integer y) {
    this.y = y;
  }

  public void setX(final Integer x) {
    this.x = x;
  }

  public void setOrientation(final String orientation) {
    this.orientation = orientation;
  }

  private final Map<String, ExecuteStrategyFactory> executeStrategyFactories;

  public MarsRover(final Integer x, final Integer y, final String orientation) {
    this.x = x;
    this.y = y;
    this.orientation = orientation;
    this.executeStrategyFactories =
      Map.of(
        "F",
        new MoveForwardStrategyFactory(),
        "B",
        new MoveBackwardStrategyFactory(),
        "L",
        new TurnLeftStrategyFactory(),
        "R",
        new TurnRightStrategyFactory()
      );
  }

  public String execute(final String command) {
    final ExecuteStrategy executeStrategy = this.executeStrategyFactories.get(command).of(this.orientation);
    executeStrategy.applyTo(this);
    return String.format("%d %d %s", x, y, orientation);
  }
}
