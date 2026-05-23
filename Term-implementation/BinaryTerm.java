package terms;

public abstract class BinaryTerm extends Term {
	protected Term left, right;

	public BinaryTerm(Term left, Term right) {
		super();
		this.left = left;
		this.right = right;
	}

}
