public class Array {
	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[10];
		int[] arr2 = { 10, 20, 30, 40, 50 }; // can't be split into two statements

		// values assigned to primitive type elements of arr1 by default is 0
		System.out.printf("%n%8s%8s%n", "Index", "Value");
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%8d%8d%n", i, arr1[i]);
		}

		System.out.printf("%n%8s%8s%n", "Index", "Value");
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("%8d%8d%n", i, arr2[i]);
		}

		// catching exceptions
		System.out.println("\n\nArray Exception Handling using try and catch");
		int[] arr3 = new int[3];
		for (int i = 0; i <= arr3.length; i++) {
			try {
				System.out.println(arr3[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		System.out.println("reached program end");
	}

}
