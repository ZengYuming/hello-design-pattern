package demo;

public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.getResult();
        context = new Context(new StrategyB());
        context.getResult();
        context = new Context(new StrategyC());
        context.getResult();
    }
}
