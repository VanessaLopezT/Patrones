package Command_Patron;

public class ClienteCommand {
    public static void main(String[] args) {
        // Crear receptor
        Receiver receiver = new Receiver();
        // Crear comandos
        Command command1 = new Command1(receiver, "parametros para Command1");
        Command command2 = new Command2();
        // Crear invocador
        Invoker invoker = new Invoker();
        // Asignar y ejecutar Command1
        invoker.setCommand(command1);
        invoker.executeCommand();
        // Asignar y ejecutar Command2
        invoker.setCommand(command2);
        invoker.executeCommand();
    }
}
