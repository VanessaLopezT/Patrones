package Command_Patron;

public class Command1 implements Command {
    private Receiver receiver;
    private String params;

    public Command1(Receiver receiver, String params) {
        this.receiver = receiver;
        this.params = params;
    }

    @Override
    public void execute() {
        receiver.operation(params);
    }
}
