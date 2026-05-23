


public enum AmpelFarbe {
	
	
	GREEN(false, false, true),
	RED(true, false, false), 
	YELLOW (false, true, false), 
	RED_YELLOW (false, true, true),
	OFF (false, false, false);
	
	// Lampen, die leuchten
	private boolean lampeOben;
	private boolean lampeMitte;
	private boolean lampeUnten;
	
	AmpelFarbe (boolean o, boolean m, boolean u ) {
		this.lampeUnten = u;
		this.lampeMitte = m;
		this.lampeOben = o;
		
	}
	
	boolean leuchtetOben() 	{ return lampeOben; };
	boolean leuchtetUnten() { return lampeUnten; };
	boolean leuchtetMitte() { return lampeMitte; };
	
	public String toLampen() {
		return "" + lampeOben + " " + lampeMitte + " " + lampeUnten;
	}

	
}
