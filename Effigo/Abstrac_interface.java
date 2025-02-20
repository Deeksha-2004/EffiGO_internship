package Effigo;
interface shape{
	double calarea();
}
	class Circle implements shape{
		private double r;
		public Circle(double r)
		{
			this.r=r;
		}
		public double calarea()
		{
			return Math.PI*r*r;
		}
	}
	class Rectangle implements shape{
		private double length;
		private double width;
		public Rectangle(double length,double width) {
			this.length=length;
			this.width=width;
		}
		public double calarea()
		{
			return length*width;
		}
	}
public class Abstrac_interface {
	public static void main(String[] args) {
		Circle c=new Circle(5.0);
		Rectangle rc=new Rectangle(4.0,3.0);
		System.out.println("Area of Circle:" +c.calarea());
		System.out.println("Area of Rectangle:" +rc.calarea());

	}

}
