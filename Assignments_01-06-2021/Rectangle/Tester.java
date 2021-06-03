package aa;

public class Tester
{

	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		
		Rectangle rectangle = new Rectangle(10, 10, 35, 30);

		
		Rectangle rect = new Rectangle(30,10);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());

		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());

		rect.move(8, 10);

		System.out.println(rect.isPointInside(13, 41));
		
	}

}
