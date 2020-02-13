package stand;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int x : requests
        ) {
            handlerA.handleRequest(x);
        }
    }
}
