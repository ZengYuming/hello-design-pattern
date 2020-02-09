package demo;

public class OperationFactorySub implements OperationFactory {
    public Operation createOperate() {
        return new OperationSub();
    }
}

