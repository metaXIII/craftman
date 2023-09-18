package com.metaxiii.fr.craft;

public class FaceEastStrategy implements TurnStrategy {

  @Override
  public void turn(final MarsRover rover) {
    rover.setOrientation("E");
  }

  @Override
  public void applyTo(final MarsRover rover) {
    turn(rover);
  }
}
