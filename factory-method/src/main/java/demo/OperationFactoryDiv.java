package demo;

public class OperationFactoryDiv implements OperationFactory {
    public Operation createOperate() {
        return new OperationDiv();
    }
}


