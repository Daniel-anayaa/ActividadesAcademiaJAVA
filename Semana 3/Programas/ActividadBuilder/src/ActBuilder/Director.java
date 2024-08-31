package ActBuilder;

public class Director {

    // Method to build a Gaming Laptop
    public void makeGamingLaptop(Builder builder) {
        builder.reset();
        builder.setCpu("Intel i9");
        builder.setScreen("4K");
        builder.setKeys(101);
        builder.setGpu("NVIDIA RTX 3080");
        builder.setBrand(Brand.DELL);
    }

    // Method to build an Office Laptop
    public void makeOfficeLaptop(Builder builder) {
        builder.reset();
        builder.setCpu("Intel i5");
        builder.setScreen("Full HD");
        builder.setKeys(101);
        builder.setGpu("Intel Integrated Graphics");
        builder.setBrand(Brand.HP);
    }
}
	