package com.metaxiii.fr.craft;

public class MoveWestStrategy implements MoveStrategy {

  @Override
  public void move(final MarsRover rover) {
    rover.setX(rover.getX() - 1);
  }

  @Override
  public void applyTo(final MarsRover rover) {
    move(rover);
  }
}
