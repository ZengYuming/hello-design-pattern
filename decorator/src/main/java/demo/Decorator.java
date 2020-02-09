package demo;

public abstract class Decorator implements Component {

    protected Component component;


    public void setComponent(Component component) {
        this.component = component;
    }

    public void operate() {
        if (component != null) {
            component.operate();
        }
    }
}
