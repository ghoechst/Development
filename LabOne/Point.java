public class Point
{
	//fields
	private double x;
	private double y;
	
	//constructors
	public Point()
	{
		x = 0;
		y = 0;
	}
	public Point( double a , double b )
	{
		x = a;
		y = b;
	}
	
	//accessor methods
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	public void printPoint()
	{
		System.out.println( "(" + x + "," + y + ")" );
	}
	
	//methods
	public Point midpoint( Point p )
	{
		double mx = ( (x + p.x) / 2 );
		double my = ( (y + p.y) / 2 );
		Point q = new Point( mx , my );
		return q;
	}
	
	public static double distance( Point p , Point q )
	{
		double d = Math.sqrt((p.x - q.x)*(p.x - q.x) + (p.y - q.y)*(p.y - q.y));
		return d;
	}
	
}