package stand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<IExpression> list = new ArrayList<IExpression>();
        list.add(new ExpressionA());
        list.add(new ExpressionB());
        list.add(new ExpressionA());
        list.add(new ExpressionA());

        for (IExpression x : list) {
            x.interpret(context);
        }
    }
}
