# Mars Rover Kata

Develop a code that moves a rover around on a grid.

## Rules:

You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.

The rover receives a string of commands.

Implement commands that move the rover forward/backward (F, B) and left right (L, R).

Example: 
```
  12 20 E
  FFFBBB
```

Then the output should be the string : `12 20 E`

This kata is interesting to practice writing tests with Cucumber. `pom.xml` is provided with a
fully functional config.

At the end, you should be able to create introduce two combined strategies, and a pretty elegant
streamed solution.
