package marsrover;

public class MarsRover {

    private CommandModule commandModule;

    public MarsRover(Gps gps) {
        this.commandModule = new CommandModule(new Motor());
    }

    public String execute(String commands) {
        //... todo: add collaboration with the members.
    }
}
