package marsrover;

public class CommandModule {

    private Motor motor;

    public CommandModule(Motor motor) {
        this.motor = motor;
    }

    public void acceptCommand(String commands) {
        for (char command : commands.toCharArray()) {
            carryOutCommand(command);
        }
    }

    private void carryOutCommand(char command) {
        if (command == 'L'){
            motor.turnLeft();

        } else if (command == 'R'){
            motor.turnRight();

        } else if (command == 'M'){
            motor.moveForward();
        }
    }
}
