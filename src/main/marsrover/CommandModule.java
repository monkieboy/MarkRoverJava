package marsrover;

public class CommandModule {

    private Motor motor;

    public CommandModule(Motor motor) {
        this.motor = motor;
    }

    public void acceptCommand(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'L'){
                motor.turnLeft();

            } else if (c == 'R'){
                motor.turnRight();

            } else if (c == 'M'){
                motor.moveForward();
            }
        }
    }
}
