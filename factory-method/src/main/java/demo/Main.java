package demo;

public class Main {
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationFactoryAdd();
        Operation operation = operationFactory.createOperate();
        operation.set_numberA(1);
        operation.set_numberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
