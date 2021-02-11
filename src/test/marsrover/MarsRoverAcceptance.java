package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverAcceptance {

    @Test
    public void canNavigateGridWithoutObstacles() {
        String commands = "MMRMMLM";
        String expectedPositionAndHeading = "2:3:N";

        Gps gps = new Gps();
        MarsRover marsRover = new MarsRover(gps);
        String actualPositionAndHeading = marsRover.execute(commands);

        assertEquals(expectedPositionAndHeading, actualPositionAndHeading);
    }
}
