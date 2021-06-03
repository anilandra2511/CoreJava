package aa;

public class Rectangle 
{
	static int x1 , x2 , y1 , y2 , width , height;
	
	Rectangle() 
	{
		System.out.println("Default Constrcutor");
	}
	
	Rectangle(int x1,int y1,int x2,int y2)
	{
		
		System.out.println("Parameterised Constructor");
	}
	
	Rectangle(int width, int height)
	{
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = width - x1;
		this.y2 = height - y1;
	}
	
	static int getHeight()
	{
		return y2 - y1;
	}
	
	static int getWidth()
	{
		return x2 - x1;
	}
	
	static int getArea()
	{
		return ((x2 - x1) * (y2 - y1));
	}
	
	static int getPerimeter()
	{
		return 2 * ((x2  - x1) + (y2 - y1));
	}
	
	public void move(int deltaX, int deltaY)
	{
		x1 += deltaX;
		y1 += deltaY;
		x2 += deltaX;
		y2 += deltaY;
	}
	
	public boolean isPointInside(int pointx, int pointy)
	{
		int count = 0;
		for(int i = x1 ; i <= x2 ; i++)
		{
			if(i == pointx)
				count++;
		}
		for(int i = y1 ; i <= y2 ; i++)
		{
			if(i == pointy)
				count++;
		}
		
		if(count == 2)
			return true;
		else
			return false;
	}
	
}
