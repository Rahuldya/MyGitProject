package Test;

public class InterfaceTestClass implements Myinterface {

	public static void main(String[] args) {


		Myinterface my = new InterfaceTestClass();
		my.fun();
		Myinterface.myfun();
		
	//	a=20; "The final field Myinterface.a cannot be assigned"
	// Myinterface mm = new Myinterface(); "Cannot instantiate the type Myinterface"
		
		System.out.println("value is:"+Myinterface.a);
		InterfaceTestClass ll =new InterfaceTestClass();
		ll.arraytest();
	}

	public void fun()
	{
		System.out.println("this is class");
	}
	
	public void arraytest()
	{
		int a[] =new int[10];
	
			for(int count=0;count<a.length;count++)
			{
				a[count]=count+1;
				System.out.println(a[count]);
			}
			int [] b =myarray(a);
			for(int count=0;count<b.length;count++)
			{
				
				System.out.println(b[count]);
			}
	}
	public int[] myarray(int []b)
	{
		int c[] =new int[b.length];
		for(int count=0;count<c.length;count++)
		{
			c[count]=count*2;
			//System.out.println(c[count]);
		}
		return c;
	}
	
}
