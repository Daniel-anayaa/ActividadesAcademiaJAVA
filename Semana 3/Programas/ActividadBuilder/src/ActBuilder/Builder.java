package ActBuilder;

public interface Builder {
	void reset();
	void setCpu(String cputype);
	void setScreen(String screentype);
	void setKeys(int numKeys);
	void setGpu(String gpuModel);
	void setBrand(Brand brand);

}
