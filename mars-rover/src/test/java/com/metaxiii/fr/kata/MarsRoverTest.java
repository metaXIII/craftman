package com.metaxiii.fr.kata;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  plugin = { "pretty", "html:target/cucumber" },
  features = { "classpath:features/" },
  glue = { "com.metaxiii.fr.kata" }
)
public class MarsRoverTest {}
