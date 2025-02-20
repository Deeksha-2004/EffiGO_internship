package Effigo;

public class Exception2 {

	public static void main(String[] args) {
		int m=0;
		int n=10;
		try {
		int ans=n/m;
		
		System.out.println(ans);
		}
		catch(ArithmeticException e)
		{
			System.err.println("The number is not divisble by zero..!!");
			
		}
		finally {
			System.out.println("The progam continues");
		}

	}

}
