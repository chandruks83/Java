package inheritance_Examples;

public class Dog extends Animal{
	private int legs;
	private int eyes;
	private int teeth;
	private int tail;
	private String coat;
	
	public Dog(String name, int size, int weight, int legs, int eyes, int teeth, int tail, String coat) {
		super(name, 1, 1, size, weight);
		this.legs = legs;
		this.eyes = eyes;
		this.teeth = teeth;
		this.tail = tail;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		this.chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk called");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		super.move(10);
	}
	
	private void moveLegs() {
		System.out.println("Dog.moveLegs() called");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs();
		super.move(speed);
	}
}

