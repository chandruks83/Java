package superAndThis;

public class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void formShape() {
		
	}
	
	//Overloaded
	public void formShape(float f) {
		
	}
	
	//Overloaded
	private static void formShape(char f) {
		
	}
}


class Rectangle extends Shape{
	private int width;
	private int length;
	
	public Rectangle(int x, int y) {
		this(x, y, 0, 0);
	}
	
	public Rectangle(int x, int y,int width, int length) {
		super(x,y);
		this.width = width;
		this.length = length;
	}
	
	
	//Overriding
	public void formShape() {
			
	}
	
	//Overloading
	public void formShape(int a) {
		
	}
}