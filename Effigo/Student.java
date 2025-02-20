package Effigo;

public class Student {
	int id;
	String name;
	int age;
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Student st1=new Student();
		st1.id=101;
		st1.name="Deeksha";
		st1.age=20;
		st1.display();
		Student st2=new Student();
		st2.id=102;
		st2.name="Deepthi";
		st2.age=18;
		st2.display();
	}

}
