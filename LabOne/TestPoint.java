public class TestPoint
{
	public static void main (String args [])
	{
		//objects!
		
		Point origin = new Point();
		Point xyInit = new Point (2.0,3.0);
		
		
		//testing the accessor methods
		System.out.println( "x = " + xyInit.getX() );
		System.out.println( "y = " + xyInit.getY() );
		System.out.println( "x = " + origin.getX() );
		System.out.println( "y = " + origin.getY() );
		
		//testing my printPoint method, and testing the constructors -- Point() vs. Point(x,y)
		origin.printPoint();
		xyInit.printPoint();
		
		//Midpoint test
		Point w = new Point(4.0,5.0);
		Point p = xyInit.midpoint(w);
		p.printPoint();
		
		//Distance test
		System.out.println( "The distance between origin and Point (x,y) is " + Point.distance(origin,xyInit) );
		
		
		//All of these tests work, and compute the right answers!
	}
	
}