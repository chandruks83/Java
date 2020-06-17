package composition;

public class Motherboard {
	private String manufacturer;
	private String model;
	private int ramSlots;

	public Motherboard(String manufacturer, String model, int ramSlots) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.ramSlots = ramSlots;
	}

	public void loadProgram(String programName) {
		System.out.println("Loading program " + programName);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public int getRamSlots() {
		return ramSlots;
	}

}
