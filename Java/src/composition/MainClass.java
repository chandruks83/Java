package composition;

public class MainClass {

	public static void main(String[] args) {
//		Monitor monitor = new Monitor("syncmaster", 17, "Samsung", new Resolution(10, 12));
//		Motherboard motherboard = new Motherboard("Intel", "I5", 4);
//		Case theCase = new Case("Zebronics", "Zeb", new Dimensions(15, 10, 12));
//		PC myPC = new PC(monitor, motherboard, theCase);
		
//		myPC.powerUp();
		
		Wall wall1 = new Wall("East");
		Wall wall2 = new Wall("Wast");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");
		Ceiling ceiling = new Ceiling(12, "Blue");
		Lamp lamp = new Lamp("Wall");
		Bed bed = new Bed("Kingsize", 2);
		BedRoom bedroom = new BedRoom(wall1, wall2, wall3, wall4, ceiling, lamp, bed);
		bedroom.getLamp().switchOn();
		bedroom.bed.makeBed();
	}
}
