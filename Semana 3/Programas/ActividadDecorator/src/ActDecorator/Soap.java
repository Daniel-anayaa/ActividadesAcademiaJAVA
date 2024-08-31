package ActDecorator;

public class Soap extends Decorator {

    public Soap(Component component) {
        super(component);
        accessoryName = "Soap";
        accessoryPrice = 50.5;
        type = "Cleaning";
    }
}
