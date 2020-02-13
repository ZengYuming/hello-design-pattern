package life;

public class Main {
    public static void main(String[] args) {

        //命令执行者
        Barbecuer boy = new Barbecuer();
        //命令准备
        Command bakeMutton = new CommandBakeMutton(boy);
        Command bakeChickenWing1 = new CommandBakeChickenWing(boy);
        Command bakeChickenWing2 = new CommandBakeChickenWing(boy);

        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMutton);
        waiter.setOrder(bakeChickenWing1);
        waiter.setOrder(bakeChickenWing2);
        waiter.notifyx();

    }
}
