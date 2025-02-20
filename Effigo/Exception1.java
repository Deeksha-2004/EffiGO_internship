package Effigo;
import java.io.*;
public class Exception1 {

	public static void main(String[] args) 
		  throws IOException{
	  FileReader f=new FileReader("C:\\Users\\deeks\\OneDrive\\Desktop\\Intern_Effigo\\hello..!!.txt");
		BufferedReader fi=new BufferedReader(f);
		
		for (int i = 0; i < 2; i++)
            System.out.println(fi.readLine());
		
		 

	}

}
