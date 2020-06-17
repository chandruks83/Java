package ReferenceInstanceObject;

public class MainClass {

	public static void main(String[] args) {
		House blueHouse = new House("Blue");
		House anotherHouse = blueHouse;
		System.out.println("blueHouse color : " + blueHouse.getColor());
		System.out.println("anotherhouse color : " + anotherHouse.getColor());
		
		House redHouse = new House("Red");
		anotherHouse = redHouse;
		System.out.println("redHouse color : " + redHouse.getColor());
		System.out.println("anotherhouse color : " + anotherHouse.getColor());
		
		House greenHouse = new House("Green");
		System.out.println("greenHouse color : " + greenHouse.getColor());
		System.out.println("anotherhouse color : " + anotherHouse.getColor());
	}

}
