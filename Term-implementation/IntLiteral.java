package terms;

public class IntLiteral extends Term {
	int value;

	public IntLiteral(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		if (value < 0)
			return "(" + value + ")" ;
		else
			return "" + value ;
	}

	@Override
	public int evaluate() {
		return value;
	}

}
