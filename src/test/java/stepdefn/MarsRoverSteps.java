import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MarsRoverSteps {
    private Rover rover;

    @Given("the plateau size is {int} {int}")
    public void setPlateauSize(int maxX, int maxY) {
        // No implementation required in this example
    }

    @Given("the rover position is {int} {int} {string}")
    public void setRoverPosition(int x, int y, String direction) {
        rover = new Rover();
        int facing;
        switch (direction) {
            case "N":
                facing = Rover.N;
                break;
            case "E":
                facing = Rover.E;
                break;
            case "S":
                facing = Rover.S;
                break;
            case "W":
                facing = Rover.W;
                break;
            default:
                throw new IllegalArgumentException("Invalid direction: " + direction);
        }
        rover.setPosition(x, y, facing);
    }

    @When("the rover moves")
    public void moveRover() {
        rover.move();
    }

    @When("the rover receives the commands {string}")
    public void processRoverCommands(String commands) {
        rover.process(commands);
    }

    @Then("the rover should have the initial position {int} {int} {string}")
    public void verifyInitialRoverPosition(int expectedX, int expectedY, String expectedDirection) {
        String currentPosition = rover.getPositionAsString();
        String expectedPosition = expectedX + " " + expectedY + " " + expectedDirection;
        Assert.assertEquals(expectedPosition, currentPosition);
    }

    @Then("the rover should be at the new position {int} {int} {string}")
    public void verifyNewRoverPosition(int expectedX, int expectedY, String expectedDirection) {
        String currentPosition = rover.getPositionAsString();
        String expectedPosition = expectedX + " " + expectedY + " " + expectedDirection;
        Assert.assertEquals(expectedPosition, currentPosition);
    }

    @Then("the rover should be at the final position {int} {int} {string}")
    public void verifyFinalRoverPosition(int expectedX, int expectedY, String expectedDirection) {
        String currentPosition = rover.getPositionAsString();
        String expectedPosition = expectedX + " " + expectedY + " " + expectedDirection;
        Assert.assertEquals(expectedPosition, currentPosition);
    }
}
