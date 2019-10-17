package OppsConc;

public class C extends B {

	
	
	
	public void m1()
	{
		System.out.println("c");
		
	}
	
	public void m1(int a)
	{
		System.out.println("c int a");
	}
	
	public static void main(String[] args) {
		
		
		A a=new C();
		B b=new C();
		A a1=new B();
		A a2=new A();
		
		
		a.m1();
		b.m1();
		a1.m1();
		a2.m1();
		
	}
	
	
	
	
}
