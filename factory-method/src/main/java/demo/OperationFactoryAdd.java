package demo;

public class OperationFactoryAdd implements OperationFactory {
    public Operation createOperate() {
        return new OperationAdd();
    }
}



