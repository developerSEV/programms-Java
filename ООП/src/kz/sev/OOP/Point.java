package kz.sev.OOP;

public class Point implements iPointCircle 
{
	private double x,y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	@Override
	public double getX()
	{
		return x;
	}
	
	@Override
	public double getY()
	{
		return y;
	}

}
