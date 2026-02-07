class Rectangle
{
	double height;
	double width;
	double getArea()
	{
		double area=height*width;
		System.out.println("Area="+area);
		return area;
	}
	double getPerimeter()
	{
		double perimeter=2*(height+width);
		System.out.println("Perimeter="+perimeter);
		return perimeter;	
	}
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.height=40;
		r1.width=4;
		
		Rectangle r2=new Rectangle();
		r2.height=35.9;
		r2.width=3.5;
		
		double area1=r1.height*r1.width;
		double perimeter1=2*(r1.height+r1.width);	
		double area2=r2.height*r2.width;
		double perimeter2=2*(r2.height+r2.width);
		
		System.out.println("Area of first rectangle:"+area1);
		System.out.println("Perimeter of first rectangle:"+perimeter1);
		System.out.println("Area of second rectangle:"+area2);		
		System.out.println("Perimeter of second rectangle:"+perimeter2);

		if(area1>area2)
		{
			System.out.println("Rectangle 1 is larger...");
		}	
		else
		{
			System.out.println("Rectangle 2 is larger...");

		}
	}
}