package Java.RotateArray;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		if (k > nums.length) {
			k = k % nums.length;
		}
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);

	}

	public void reverse(int[] array, int start, int end) {
		int temp;
		while (start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
