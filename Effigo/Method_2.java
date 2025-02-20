package Effigo;
class Student1{
	public void StudentID(String name,int roll_no)
	{
		System.out.println("Name:"+name+" "+"Roll no:"+ roll_no);
	}
	public void StudentID(int roll_no,String name)
	{
		System.out.println("Roll no:"+ roll_no+" "+"Name:"+name);
	}
	
}
public class Method_2 {

	public static void main(String[] args) {
		Student1 ob=new Student1();
		ob.StudentID("Deeksha",1);
		ob.StudentID(1,"Deepthi");
	}

}
