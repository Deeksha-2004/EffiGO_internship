package Effigo;
import java.io.*;
class product{
	public int multiply(int a,int b)
	{
		int prod=a*b;
		return prod;
	}
	public double multiply(double a,double b,double c)
	{
		double prod=a*b*c;
		return prod;
	}
}
public class Method_1 {

	public static void main(String[] args) {
		product ob=new product();
		int prod1=ob.multiply(1,2);
		System.out.println(prod1);
		double prod2=ob.multiply(1.0,2.0,4.0);
		System.out.println(prod2);

	}

}
