Feature: Mars Rover
    As a NASA engineer
    I want to control the Mars Rovers
    So that I can explore the Martian plateau

    Scenario: Rover direction facing and positioning initialization
        Given the plateau size is 5 5
        And the rover position is 3 4 E
        Then the rover should have the initial position 3 4 E

    Scenario: Moving the rover x and y position and location
        Given the plateau size is 5 5
        And the rover position is 1 1 N
        When the rover moves
        Then the rover should be at the new position 1 2 N

    Scenario: Move the rover as per the given scenario problem
        Given the plateau size is 5 5
        And the rover position is 1 2 N
        When the rover receives the commands "LMLMLMLMM"
        Then the rover should be at the final position 1 3 N
