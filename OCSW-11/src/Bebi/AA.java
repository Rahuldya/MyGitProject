package Bebi;

public class AA {

	public String s;

	public AA(int a)
	{
		System.out.println("Hello");
	}
	
	
	public void set(String s1)
	{
		
		this.s=s1;
	}
	public String hello()
	{
		
		
		System.out.println("I am Hello method()");
		
		return s;
	}
	public static void main(String[] args) {
		AA a = new AA(10);
		a.set("asdfgh");

	}

	

}
