package com.metaxiii.fr.craft;

public class MoveNorthStrategy implements MoveStrategy {

  @Override
  public void move(final MarsRover rover) {
    rover.setY(rover.getY() + 1);
  }

  @Override
  public void applyTo(final MarsRover rover) {
    move(rover);
  }
}
