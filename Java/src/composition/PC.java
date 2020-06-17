package composition;

public class PC {
	private Monitor monitor;
	private Motherboard motherboard;
	private Case theCase;
	
	public PC(Monitor monitor, Motherboard motherboard, Case theCase) {
		this.monitor = monitor;
		this.motherboard = motherboard;
		this.theCase = theCase;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		showLogo();
	}
	
	private void showLogo() {
		monitor.drawPixelAt(200, 200, "Red");
	}
}
