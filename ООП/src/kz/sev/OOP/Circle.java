package kz.sev.OOP;

public class Circle 
{
	private double r;
	private Point point;
	
	public Circle(double r,Point point)
	{
		this.r = r;
		this.point = point;
	}


	public double getR() 
	{
		return r;
	}
	
	public boolean verPoint(Point p)
	{
		double x = p.getX();
		double y = p.getY();
		
		
		double t = Math.pow(point.getX() - x,2) + Math.pow(point.getY() - y,2);
		
		if(t <= Math.pow(r, 2))
		return true;
		else return false;
	}

	
	
}
