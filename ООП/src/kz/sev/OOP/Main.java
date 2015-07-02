package kz.sev.OOP;

public class Main 
{

	public static void main(String[] args) 
	{
		Point pointCircle = new Point(4,5);
		Circle circle = new Circle(3,pointCircle);
		
		
		Point[] point = new Point[10];
		
		for(int i = 0; i < point.length; i++)
		{
			point[i] = new Point((int)Math.round(Math.random()*10),(int)Math.round(Math.random()*10));
			boolean chek = circle.verPoint(point[i]);
			System.out.println("x - "+point[i].getX()+" y - "+point[i].getY()+" res - "+chek);
		}

	}

}
