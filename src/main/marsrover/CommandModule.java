package marsrover;

public class CommandModule {

    private Motor motor;

    public CommandModule(Motor motor) {

        this.motor = motor;
    }

    public void acceptCommand(String commands) {

        if (commands.equals("L")){
            motor.turnLeft();
        } else {
            motor.turnRight();
        }
    }
}
