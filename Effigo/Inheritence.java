package Effigo;
class A{
	public void printA()
	{
		System.out.println("Class A");
	}
}
class B extends A{
	public void printB()
	{
		System.out.println("Class B");
	}	
}
class C extends B{
	public void printC()
	{
		System.out.println("Class C");
	}	
}
public class Inheritence {

	public static void main(String[] args) {
		B ob=new B();
		ob.printA();
		ob.printB();
		C ob1=new C();
		ob1.printA();
		ob1.printB();
		ob1.printC();
		

	}

}
