package demo;

public class OperationFactoryMul implements OperationFactory {
    public Operation createOperate() {
        return new OperationMul();
    }
}

