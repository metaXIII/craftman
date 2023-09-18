package com.metaxiii.fr.craft;

public class FaceSouthStrategy implements TurnStrategy {

  @Override
  public void turn(final MarsRover rover) {
    rover.setOrientation("S");
  }

  @Override
  public void applyTo(final MarsRover rover) {
    turn(rover);
  }
}
