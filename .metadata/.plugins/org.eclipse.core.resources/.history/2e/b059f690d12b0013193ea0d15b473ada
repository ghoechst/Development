public class Fraction
{
	//field
	private int numerator;
	private int denominator;
	
	//constructors
	public Fraction()
	{
		numerator = 1;
		denominator = 1;
	}
	public Fraction( int x )
	{
		numerator = 1;
		denominator = x;
	}
	public Fraction( int x , int y )
	{
		numerator = x;
		denominator = y;
	}
	
	//accessor methods
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	//method to print a regular fraction
	public void printFraction()
	{
		System.out.println( numerator + "/" + denominator);
	}
	
	//method for printing as a decimal
	public double asDecimal()
	{
		double d = (double) numerator / (double) denominator;
		return d;
	}
	
	//multiplication method
	public static Fraction multiplyTwo( Fraction f , Fraction g )
	{
		int largerNumber;
		int smallerNumber;
		int upperLimit;
		int lowerLimit;
		int i;
		int mx = f.numerator * g.numerator;
		int my = f.denominator * g.denominator;
		if (mx > my)
		{
			largerNumber = mx;
			smallerNumber = my;
		}
		else
		{
			largerNumber = my;
			smallerNumber = mx;
		}
		upperLimit = (int) largerNumber/2;
		lowerLimit = (int) 2;
		i = upperLimit;
		while ( i >= lowerLimit )
		{
			if ((largerNumber % i) == 0)
			{
				if (smallerNumber % i == 0)
				{
					Fraction h = new Fraction( mx/i , my/i );
					return h;
				}
			}
			i--;	
		}
		Fraction h = new Fraction( mx , my );
		return h;
	}
}