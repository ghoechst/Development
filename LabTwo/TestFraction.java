public class TestFraction
{
	public static void main (String args[])
	{
		
		//objects!
		Fraction empty = new Fraction();
		Fraction xInit = new Fraction( 4 );
		Fraction xyInit = new Fraction( 2 , 5 );
		
		//testing the accessor methods
		System.out.println( "Numerator = " + empty.getNumerator() );
		System.out.println( "Denominator = " + empty.getDenominator() );
		System.out.println( "Numerator = " + xInit.getNumerator() );
		System.out.println( "Denominator = " + xInit.getDenominator() );
		System.out.println( "Numerator = " + xyInit.getNumerator() );
		System.out.println( "Denominator = " + xyInit.getDenominator() );
		
		//testing out my print Fraction method, and testing the difference between the constructors
		empty.printFraction();
		xInit.printFraction();
		xyInit.printFraction();
		
		//test of the decimal method
		System.out.println( empty.asDecimal() );
		System.out.println( xInit.asDecimal() );
		System.out.println( xyInit.asDecimal() );
		
		//multiplication method test
		Fraction f = Fraction.multiplyTwo( xInit , xyInit );
		f.printFraction();
		
		//all of these work and compute correctly
		
	}
}