public class AmpelOld {

	static final byte GREEN = 0;
	static final byte RED = 1;
	static final byte YELLOW = 2;
	static final byte RED_YELLOW = 3;
	static final byte OFF = 4;
	static String[] messages = { "GREEN", "RED", "YELLOW", "RED_YELLOW" };

	private byte zustand;
	private int nummer;

	public Ampel(int nummer) {
		this.zustand = RED;
		this.nummer = nummer;
	}

	public int getZustand() {
		return zustand;
	}

	public void schalten() {

		switch (zustand) {

		case RED:
			zustand = RED_YELLOW;
			break;
		case YELLOW:
			zustand = RED;
			break;
		case GREEN:
			zustand = YELLOW;
			break;
		case RED_YELLOW:
			zustand = GREEN;
			break;
		}
	}

	public String getFarbe() {
		return "" + nummer + " " + messages[this.zustand];
	}

	// Die folgende Methode ist nur dann erforderlich, wenn die Ampel sich selbst steuert
	public void steuernAutomatisch() {
		try {
			do {
				this.schalten();
				System.out.println("" + this.nummer + ":" + getFarbe());
				Thread.sleep(1000);
			} while (true);
		} catch (Exception e) {
			System.out.println("INTERNAL ERROR");
		}

	}

}
