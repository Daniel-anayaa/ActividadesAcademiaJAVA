package ActDecorator;

public class Coins extends Decorator {

    public Coins(Component component) {
        super(component);
        accessoryName = "Coins";
        accessoryPrice = 20.5;
        type = "Currency";
    }
}
