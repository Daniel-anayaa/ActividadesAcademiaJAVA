package ActBuilder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        LaptopBuilder builder = new LaptopBuilder();

        // Build a Gaming Laptop
        director.makeGamingLaptop(builder);
        Laptop gamingLaptop = builder.getResult();
        System.out.println("Gaming Laptop built: " + gamingLaptop);

        // Build an Office Laptop
        director.makeOfficeLaptop(builder);
        Laptop officeLaptop = builder.getResult();
        System.out.println("Office Laptop built: " + officeLaptop);
    }
}
