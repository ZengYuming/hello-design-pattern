package stand;

/**
 * 表达式
 */
public class ExpressionA implements IExpression {
    public void interpret(Context context) {
        System.out.println("解释器A");
    }
}