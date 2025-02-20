package Effigo;

public class Exception5 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of range please check the code");
		}

	}

}
