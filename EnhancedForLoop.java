public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] array = { 19, 45, 3, 4, 2, 4, 5, 6, 7, 6, 5, 4, 4, 3, 2, 5, 6, 6, 3 };
		int total = 0;

		for (int num : array)
			total += num;

		System.out.println("Sum of array values: " + total);
	}
}
