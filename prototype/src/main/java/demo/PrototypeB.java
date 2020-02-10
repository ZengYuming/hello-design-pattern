package demo;

public class PrototypeB extends Prototype {
    public PrototypeB(String id) {
        super(id);
    }

    public Prototype clone() {
        PrototypeB prototype=new PrototypeB(this.getId());
        return prototype;
    }
}
