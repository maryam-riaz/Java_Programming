public class ValuePassedToMethod {
	public static void main(String[] args) {
		A arr[] = new A[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new A(i);
		}
System.out.println("Before any changes: ");
for (A num : arr) {
	System.out.println(num);
}

fun(arr);
System.out.println("After changes: ");
		for (A num : arr) {
			System.out.println(num);
		}

		System.out.println("One objects values before passing to method that changes it: ");
		func(arr[0]);
		System.out.println("Value after change: ");
		System.out.println(arr[0]);
	}

	public static void fun(A[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].setI(arr[i].getI() * 2);
		}
	}

	public static void func(A i) {
		i.setI(i.getI() + 2);
	}
}

class A {
	int a = 0;

	public A(int i)
	{
		a =i;
	}

	@Override
	public String toString() {
		return String.format("%s", a);
	}

	public void setI(int i) {
		this.a = i;

	}

	public int getI() {
		return a;
	}
}
