package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GpsTest {

    @Test
    void givenTheOriginPosition_remainsThePositionAfterTurning() {

        Gps gps = new Gps();
        String expectedPositionAndHeading = "0:0:W";
        // ..

        MarsRover marsRover = new MarsRover(gps);
        String actualPositionAndHeading = marsRover.execute("L");

        assertEquals(expectedPositionAndHeading, actualPositionAndHeading);
    }
}
