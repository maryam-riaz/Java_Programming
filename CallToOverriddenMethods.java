public class CallToOverriddenMethods {
public static void main(String[] args) {
	A a = new C();
	System.out.println(a.getClass().getName());
	System.out.print("obj is instance of C: ");
	if (a instanceof C)
	System.out.println("true");
	else 
	System.out.println("false");

	System.out.print("obj is instance of B: ");
	if (a instanceof B)
	System.out.println("true");
	else 
	System.out.println("false");

	System.out.print("obj is instance of A: ");
	if (a instanceof A)
	System.out.println("true");
	else 
	System.out.println("false");

	((A)a).method(); // even with brute force the overriden method gets called 
}	
}

class A{
	public void method(){
		System.out.println("Method of Class A");
	}
}

class B extends A{
	public void method(){
		System.out.println("Method of Class B");
	}
}
class C extends B{
	public void method(){
		System.out.println("Method of Class C");
	}
}
