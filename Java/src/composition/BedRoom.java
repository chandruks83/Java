package composition;

public class BedRoom {
	Wall wall1;
	Wall wall2;
	Wall wall3;
	Wall wall4;
	
	Ceiling ceiling;
	Lamp lamp;
	Bed bed;
	public BedRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Bed bed) {
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.lamp = lamp;
		this.bed = bed;
	}
	public Wall getWall1() {
		return wall1;
	}
	public Wall getWall2() {
		return wall2;
	}
	public Wall getWall3() {
		return wall3;
	}
	public Wall getWall4() {
		return wall4;
	}
	public Ceiling getCeiling() {
		return ceiling;
	}
	public Lamp getLamp() {
		return lamp;
	}
	public Bed getBed() {
		return bed;
	}
}
