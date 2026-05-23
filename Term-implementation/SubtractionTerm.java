package terms;

public class SubtractionTerm extends BinaryTerm {
	
	public SubtractionTerm(Term left, Term right){
		super(left,right);
	}
	
	public int evaluate(){
		return left.evaluate() - right.evaluate(); 
	}

	@Override
	public String toString() {
		return left + " - " + right;
	}

}
