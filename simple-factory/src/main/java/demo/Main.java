package demo;

public class Main {
    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.createOperate('+');
        operation.set_numberA(1);
        operation.set_numberB(2);
        double result = operation.getResult();
    }
}
