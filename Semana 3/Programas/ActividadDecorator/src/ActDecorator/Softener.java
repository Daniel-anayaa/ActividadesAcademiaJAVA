package ActDecorator;

public class Softener extends Decorator {

    public Softener(Component component) {
        super(component);
        accessoryName = "Softener";
        accessoryPrice = 50.5;
        type = "Cleaning";
    }
}
