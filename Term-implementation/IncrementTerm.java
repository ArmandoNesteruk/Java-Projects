package terms;

public class IncrementTerm extends UnaryTerm {
	
	public IncrementTerm(Term term){
		super(term);
	}
	
	public int evaluate(){
		return term.evaluate() + 1; 
	}

	@Override
	public String toString() {
		return "++[" + term + "]";
	}

}
