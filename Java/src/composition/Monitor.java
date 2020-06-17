package composition;

public class Monitor {
	private String model;
	private int size;
	private String manufacturer;
	private Resolution resolution;

	public Monitor(String model, int size, String manufacturer, Resolution resolution) {
		this.model = model;
		this.size = size;
		this.manufacturer = manufacturer;
		this.resolution = resolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + "," + y + " with color "+ color);
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public Resolution getResolution() {
		return resolution;
	}

}
