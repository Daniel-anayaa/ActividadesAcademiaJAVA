package ActBuilder;

public class Laptop {
	
	//Create the object instances
	
    private String cpu;
    private String screen;
    private int keys;
    private String gpu;
    private Brand brand;

    // Constructors for each component
    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setScreen(String screen) { this.screen = screen; }
    public void setKeys(int keys) { this.keys = keys; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public void setBrand(Brand brand) { this.brand = brand; }

    @Override
    //Override how will it prints
    public String toString() {
        return "Laptop [CPU=" + cpu + ", Screen=" + screen + ", Keys=" + keys + ", GPU=" + gpu + ", Brand=" + brand + "]";
    }
}
