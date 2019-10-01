package test;
import java.util.*;

public class AK_sum

{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int start = in.nextInt();
		int end = in.nextInt ();
		int sum = 0;
		for (int i=start; i<=end; i++) {
			sum = sum + i;
			System.out.println(i);
        }
		System.out.println("the total is " + sum);
		in.close();
			
	}
}
