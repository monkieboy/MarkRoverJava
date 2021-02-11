package marsrover;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;


public class CommandModuleTest {

    @Test
    void givenTurnLeftInstruction_issuesTurnLeftCommand() {
        Motor motor = mock(Motor.class);
        CommandModule commandDecoder = new CommandModule(motor);

        commandDecoder.acceptCommand("L");

        verify(motor, times(1)).turnLeft();
    }

    @Test
    void givenTurnRightInstruction_issuesTurnRightCommand() {
        Motor motor = mock(Motor.class);
        CommandModule commandDecoder = new CommandModule(motor);

        commandDecoder.acceptCommand("R");

        verify(motor, times(1)).turnRight();
    }

    @Test
    void givenMoveInstruction_issuesMoveCommand() {
        Motor motor = mock(Motor.class);
        CommandModule commandDecoder = new CommandModule(motor);

        commandDecoder.acceptCommand("M");

        verify(motor, times(1)).moveForward();
    }

    @Test
    void givenMultiStepInstruction_issuesAppropriateCommands() {
        Motor motor = mock(Motor.class);
        CommandModule commandDecoder = new CommandModule(motor);
        InOrder inOrder = Mockito.inOrder(motor);

        commandDecoder.acceptCommand("LRM");

        inOrder.verify(motor).turnLeft();
        inOrder.verify(motor).turnRight();
        inOrder.verify(motor).moveForward();
    }

}
