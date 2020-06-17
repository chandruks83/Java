package inheritance_Examples;

public class Fish extends Animal {
	private int fins;
	private int eyes;
	private int tail;
	
	public Fish(String name, int size, int weight, int fins, int eyes, int tail) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.fins = fins;
		this.tail = tail;
	}
	
	private void rest() {
		
	}
	
	private void moveMuscle() {
		System.out.println("Fish.moveMuscle() called");
	}
	
	private void moveBackFin() {
		System.out.println("Fish.moveBackFin() called");
	}
	
	public void swim(int speed) {
		System.out.println("Fish.swim() called. swimming at speed " + speed);
		moveMuscle();
		moveBackFin();
		move(speed);
	}
}
