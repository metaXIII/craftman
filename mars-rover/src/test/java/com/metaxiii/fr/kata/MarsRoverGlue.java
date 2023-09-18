package com.metaxiii.fr.kata;

import com.metaxiii.fr.craft.MarsRover;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MarsRoverGlue {

  MarsRover rover;
  String finalPosition;

  @Given("The rover starts at position {int} {int} and facing {word}")
  public void the_rover_starts_at_position_and_facing_n(final Integer x, final Integer y, final String orientation) {
    rover = new MarsRover(x, y, orientation);
  }

  @When("The command {word} is given to the rover")
  public void the_command_f_is_given_to_the_rover(final String command) {
    finalPosition = rover.execute(command);
  }

  @Then("The rover will return a position and orientation of {string}")
  public void the_rover_will_return_a_position_and_orientation_of(final String expectedPosition) {
    Assert.assertEquals(expectedPosition, finalPosition);
  }
}
