package Effigo;
class MyException extends Exception{
	public MyException(String m) {
		super(m);
	}
}


public class Exception3 {

	public static void main(String[] args) {
		try {
			throw new MyException("This is a custom exception");
		}
		catch(MyException ex) {
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}

	}

}
