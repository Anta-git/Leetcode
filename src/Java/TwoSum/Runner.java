package Java.TwoSum;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] input = new int[]{3, 2, 4};

		System.out.println(Arrays.toString(twoSum.twoSum(input, 6)));
	}
}
