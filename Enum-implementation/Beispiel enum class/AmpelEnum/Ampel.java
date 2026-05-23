public class Ampel {

	
	private AmpelFarbe zustand;
	private int nummer;

	public Ampel(int nummer) {
		this.zustand = AmpelFarbe.RED;
		this.nummer = nummer;
	}

	public AmpelFarbe getZustand() {
		return zustand;
	}

	public void schalten() {

		// switch über enums möglich
		switch (zustand) {

		case RED:
			zustand = AmpelFarbe.RED_YELLOW;
			break;
		case YELLOW:
			zustand = AmpelFarbe.RED;
			break;
		case GREEN:
			zustand = AmpelFarbe.YELLOW;
			break;
		case RED_YELLOW:
			zustand = AmpelFarbe.GREEN;
			break;
		}
	}

	// to String über enums möglich
	public String toString() {
		return "" + this.nummer + ": zustand=" + zustand.toString() + " "+ zustand.toLampen();
	}
	

}
