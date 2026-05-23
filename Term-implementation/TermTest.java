package terms;

public abstract class TermTest {

	public static void main(String[] args) {
		
		IntLiteral lit1 = new IntLiteral(8);
		IntLiteral lit2 = new IntLiteral(60);
		IntLiteral lit3 = new IntLiteral(45);

		// 8 + 60
		PlusTerm p1 = new PlusTerm(lit1, lit2);
		//  (8+60) + 45
		PlusTerm p2 = new PlusTerm(p1, lit3);

		// ((8+60) + 45) + (- 1)
		PlusTerm p3 = new PlusTerm(p2, new IntLiteral(-1));
		// ... -100
		SubtractionTerm s = new SubtractionTerm(p3,new IntLiteral(100));
		

		System.out.println(p3 + " = " + p3.evaluate());
		
		System.out.println(s + " = " + s.evaluate());
		
		
	}
}
