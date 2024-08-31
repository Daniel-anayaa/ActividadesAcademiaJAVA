package ActDecorator;

public class Washer extends Component {

    public Washer() {
        accessoryName = "Washer";
        accessoryPrice = 5000.0;
        type = "Cleaning";
    }

    @Override
    public String getAccessoryName() {
        return accessoryName;
    }

    @Override
    public double getTotalCost() {
        return accessoryPrice;
    }

    @Override
    public String getType() {
        return "The type of accessory is " + type;
    }
}
