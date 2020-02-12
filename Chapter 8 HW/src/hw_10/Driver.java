package hw_10;

public class Driver {
	public static void main(String[] args) {
		double[] numbers = { 1.0, 2.1, 1.9, 4.5, 3.2, 2.9, 3.4 };
		
		RecursiveSorts.quickSort(numbers);
		for(int x = 0; x < numbers.length; x++)
			System.out.println(numbers[x]);
	}
}
