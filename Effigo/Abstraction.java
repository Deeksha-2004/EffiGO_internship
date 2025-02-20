package Effigo;

abstract class Animal{
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public abstract void makesound();
	public String getName()
	{
		return name;
	}
}
class Dog extends Animal{
	public Dog(String name)
	{
		super(name);
	}
	public void makesound() {
		System.out.println(getName()+" " + "barks");
	}
}
class Cat extends Animal{
	public Cat(String name)
	{
		super(name);
	}
	public void makesound() {
		System.out.println(getName()+" " + "meow");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Animal myDog=new Dog("AAA");
		Animal myCat=new Cat("BBB");
		myDog.makesound();
		myCat.makesound();
	}

}
