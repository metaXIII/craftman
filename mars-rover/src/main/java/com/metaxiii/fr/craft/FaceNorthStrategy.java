package com.metaxiii.fr.craft;

public class FaceNorthStrategy implements TurnStrategy {

  @Override
  public void turn(final MarsRover rover) {
    rover.setOrientation("N");
  }

  @Override
  public void applyTo(final MarsRover rover) {
    turn(rover);
  }
}
