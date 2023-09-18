package com.metaxiii.fr.craft;

public class FaceWestStrategy implements TurnStrategy {

  @Override
  public void turn(final MarsRover rover) {
    rover.setOrientation("W");
  }

  @Override
  public void applyTo(final MarsRover rover) {
    turn(rover);
  }
}
