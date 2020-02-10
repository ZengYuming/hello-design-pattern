import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，被Builder构建
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    /**
     * @param part
     */
    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("构建产品");
        for (String x : parts) {
            System.out.println(x);
        }
    }
}
