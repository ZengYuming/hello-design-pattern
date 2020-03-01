package stand;

import java.util.Hashtable;

/**
 * 享元工厂
 * 用来管理和创建Flyweight对象。主要用来确保合理地共享Flyweight。
 */
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X", new FlyweightConcrete());
        flyweights.put("Y", new FlyweightConcrete());
        flyweights.put("Z", new FlyweightConcrete());
    }

    public IFlyweight getFlyweight(String key) {
        return (IFlyweight) flyweights.get(key);
    }
}