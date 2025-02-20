package Effigo;

class encaps {
	private String name;
	private String email;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
}
public class Encaps1 {
	public static void main(String[] args) {
		encaps ac=new encaps();
		ac.setName("Deeksha");
		ac.setEmail("dee@gmail.com");
		
		System.out.println("Name:" + ac.getName());
		System.out.println("Email:" + ac.getEmail());

	}

}
