import java.util.*;

public class ArrayListTesting {

	public static void main(String[] args) {
		String str = "Hello World";
		for (int i = 0; i < 100; i++) {
			System.out.println(rearrange(str));
		}
	}

	public static void rearrange(ArrayList<Double> arr) {
		ArrayList<Double> shuffledArr = new ArrayList<Double>();
		int size = arr.size();
		for (int i = 0; i < size; i++) {
			shuffledArr.add(arr.remove((int) (Math.random() * arr.size())));
		}
		arr = new ArrayList<Double>(shuffledArr);
	}

	public static String rearrange(String str) {
		int length = str.length();
		String shuffle = new String();
		for (int i = 0; i < length; i++) {
			int k = (int) (Math.random() * str.length());
			shuffle += str.substring(k, k + 1);
			str = str.substring(0, k) + str.substring(k + 1);
		}
		return shuffle;
	}

	public static void addAverage(ArrayList<Double> numbers) {
		numbers.add(average(numbers));
	}

	public static double average(ArrayList<Double> numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}
		return sum / numbers.size();
	}

}
