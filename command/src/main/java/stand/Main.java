package stand;

public class Main {
    public static void main(String[] args) {
        Receiver r=new Receiver();
        Command c=new CommandA(r);
        Invoker i=new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
