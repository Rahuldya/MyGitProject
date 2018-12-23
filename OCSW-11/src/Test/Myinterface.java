package Test;

public interface Myinterface {

	int a=10;
	
	public static void  myfun()
	{
		System.out.println("Hello this is Interface");
	}
	
	
/*	public Myinterface()  //Interfaces cannot have constructors
	{}
	
*/
	public void fun();
	
	Myinterface mm=new InterfaceTestClass();
	
	
}
