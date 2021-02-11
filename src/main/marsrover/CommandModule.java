package marsrover;

public class CommandModule {

    private Motor motor;

    public CommandModule(Motor motor) {

        this.motor = motor;
    }

    public void acceptCommand(String commands) {
        motor.turnLeft();
    }
}
