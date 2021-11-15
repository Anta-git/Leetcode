package Java.SingleNumber;

import java.util.HashSet;
import java.util.Set;

//Each element in the array appears twice except for one element which appears only once.
//todo: Could be improved by using bitwise XOR.
public class SingleNumber {
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (set.contains(num)) {
				set.remove(num);
			} else {
				set.add(num);
			}
		}
		return set.stream().findFirst().orElse(0);
	}
}
