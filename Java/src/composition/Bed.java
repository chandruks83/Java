package composition;

public class Bed {
	private String bedType;
	private int height;
	public Bed(String bedType, int height) {
		this.bedType = bedType;
		this.height = height;
	}
	public String getBedType() {
		return bedType;
	}
	public int getHeight() {
		return height;
	}
	
	public void makeBed() {
		System.out.println("Making bed");
	}
}
