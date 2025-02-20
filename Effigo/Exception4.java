package Effigo;
import java.io.*;
public class Exception4 {

	public static void main(String[] args) 
		throws ClassNotFoundException{
		try {
		Class temp=Class.forName("gfg");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class does not exist check the nam eof the class");
		}

	}

}
