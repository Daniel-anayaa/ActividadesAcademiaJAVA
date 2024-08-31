package ActDecorator;

public abstract class Component {

    // Private attributes for encapsulation
    private Component component;
    String accessoryName;
    double accessoryPrice;
    String type; // Add type attribute

    // Constructors
    Component() {}

    Component(Component component) {
        this.component = component;
    }

    // Getter and setter for the component
    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    // Methods to get accessory name, total cost, and type
    public String getAccessoryName() {
        if (component == null) {
            return accessoryName;
        } else {
            return component.getAccessoryName() + "\n" + accessoryName;
        }
    }

    public double getTotalCost() {
        if (component == null) {
            return accessoryPrice;
        } else {
            return component.getTotalCost() + accessoryPrice;
        }
    }

    public String getType() {
        if (component == null) {
            return "The type of accessory is " + type;
        } else {
            return component.getType() + "\n" + "The type of accessory is " + type;
        }
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }
}
