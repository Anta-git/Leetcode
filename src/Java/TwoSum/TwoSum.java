package Java.TwoSum;

import java.util.Arrays;

public class TwoSum {
	//https://leetcode.com/problems/two-sum/
	//todo: This could be massively improved with use of a hashmap.
	public int[] twoSum(int[] nums, int target) {
		int counter = 1;
		for (int i = 0; i < nums.length; i++) {
			int targetValueIndex = containsValueAt(Arrays.copyOfRange(nums, i + 1, nums.length), target - nums[i]);
			if (targetValueIndex != -1) {
				return new int[]{i, targetValueIndex + counter};
			}
			counter++;
		}
		//this should never be hit, as a constraint is that an answer will always exist.
		return new int[]{0, 0};
	}

	//returns the first array index that the passed value is at if present, otherwise -1
	private int containsValueAt(int[] arrToSearch, int value) {
		for (int i = 0; i < arrToSearch.length; i++) {
			if (arrToSearch[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
