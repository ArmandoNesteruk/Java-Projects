package terms;

public abstract class UnaryTerm extends Term {
	protected Term term;

	public UnaryTerm(Term term) {
		super();
		this.term = term;
	}

}
