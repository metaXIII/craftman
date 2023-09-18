Feature: MarsRover that receives commands and reports position

  MarsRover given an initial position should receive commands and return the resulting position after executing the command

  Scenario Template: Move forward
    Given The rover starts at position <x> <y> and facing <orientation>
    When The command F is given to the rover
    Then The rover will return a position and orientation of <result>
    Examples:
      | x | y | orientation | result   |
      | 0 | 0 | N           | "0 1 N"  |
      | 4 | 4 | N           | "4 5 N"  |
      | 0 | 0 | S           | "0 -1 S" |
      | 0 | 0 | E           | "1 0 E"  |
      | 0 | 0 | W           | "-1 0 W" |

  Scenario Template: Move backward
    Given The rover starts at position <x> <y> and facing <orientation>
    When The command B is given to the rover
    Then The rover will return a position and orientation of <result>
    Examples:
      | x | y | orientation | result   |
      | 0 | 0 | N           | "0 -1 N" |
      | 4 | 4 | N           | "4 3 N"  |
      | 0 | 0 | S           | "0 1 S"  |
      | 0 | 0 | E           | "-1 0 E" |
      | 0 | 0 | W           | "1 0 W"  |

  Scenario Template: Turn left
    Given The rover starts at position <x> <y> and facing <orientation>
    When The command L is given to the rover
    Then The rover will return a position and orientation of <result>
    Examples:
      | x | y | orientation | result  |
      | 0 | 0 | N           | "0 0 W" |
      | 4 | 4 | N           | "4 4 W" |
      | 0 | 0 | S           | "0 0 E" |
      | 0 | 0 | E           | "0 0 N" |
      | 0 | 0 | W           | "0 0 S" |

  Scenario Template: Turn right
    Given The rover starts at position <x> <y> and facing <orientation>
    When The command R is given to the rover
    Then The rover will return a position and orientation of <result>
    Examples:
      | x | y | orientation | result  |
      | 0 | 0 | N           | "0 0 E" |
      | 4 | 4 | N           | "4 4 E" |
      | 0 | 0 | S           | "0 0 W" |
      | 0 | 0 | E           | "0 0 S" |
      | 0 | 0 | W           | "0 0 N" |
