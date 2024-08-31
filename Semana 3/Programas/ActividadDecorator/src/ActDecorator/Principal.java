package ActDecorator;

public class Principal {

    public static void main(String[] args) {
        Component component = new Soap(
            new Coins(
                new Softener(
                    new Washer()
                )
            )
        );

        System.out.println(component.getAccessoryName());
        System.out.println("Total Cost: " + component.getTotalCost());
        System.out.println(component.getType());
    }
}
