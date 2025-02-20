package Effigo;
class Animall{
	void move()
	{
		System.out.println("Animal is moving");
	}
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dogg extends Animall{
	@Override void move()
	{
		System.out.println("Dog is running");
	}
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class Method_3 {

	public static void main(String[] args) {
		Dogg d=new Dogg();
		d.move();
		d.eat();
		d.bark();

	}

}
