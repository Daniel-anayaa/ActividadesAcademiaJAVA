package ActBuilder;

public class LaptopBuilder implements Builder {
	
	//Encapsulate
    private Laptop laptop;

    @Override
    public void reset() {
        this.laptop = new Laptop(); // Start with a new Laptop instance
    }
    //Set every parameter from the laptop

    @Override
    public void setCpu(String cpuType) {
        laptop.setCpu(cpuType);
    }

    @Override
    public void setScreen(String screenType) {
        laptop.setScreen(screenType);
    }

    @Override
    public void setKeys(int numKeys) {
        laptop.setKeys(numKeys);
    }

    @Override
    public void setGpu(String gpuModel) {
        laptop.setGpu(gpuModel);
    }

    @Override
    public void setBrand(Brand brand) {
        laptop.setBrand(brand);
    }

    //Return the build Laptop result
    public Laptop getResult() {
        return this.laptop; // 
    }
}
