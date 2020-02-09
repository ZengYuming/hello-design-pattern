package demo;

public class Context {
    private Strategy cs;

    public Context(Strategy cs) {
        this.cs = cs;
    }

    public void getResult() {
        cs.getResult();
    }
}
