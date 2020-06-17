package composition;

public class Lamp {
	private String type;

	public Lamp(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public void switchOn() {
		System.out.println("Lamp swithced on");
	}
}
