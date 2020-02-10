package demo;

public class PrototypeA extends Prototype {
    public PrototypeA(String id) {
        super(id);
    }

    public Prototype clone() {
        PrototypeA prototype=new PrototypeA(this.getId());
        return prototype;
    }
}
