package composition;

public class Case {
	private String manufacturer;
	private String model;
	private Dimensions dimensions;

	public Case(String manufacturer, String model, Dimensions dimensions) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.dimensions = dimensions;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
}
