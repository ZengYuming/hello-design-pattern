package stand;

/**
 * 抽象表达式
 * 声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 */
public interface IExpression {
    void interpret(Context context);
}