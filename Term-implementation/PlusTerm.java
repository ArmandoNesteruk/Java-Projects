package terms;

public class PlusTerm extends BinaryTerm {
	
	public PlusTerm(Term left, Term right){
		super(left,right);
	}
	
	public int evaluate(){
		return left.evaluate() + right.evaluate(); 
	}

	@Override
	public String toString() {
		return left + " + " + right;
	}

}
