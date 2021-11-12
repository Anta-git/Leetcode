package Java.RemoveDupesSortedArray;

public class RemoveDupes {
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int previousValue = nums[0];
        int counter = 1;

        for (int i = 1; i < nums.length; i++) {
            if(!(nums[i] == previousValue)) {
                nums[counter] = nums[i];
                previousValue = nums[counter];
                counter++;
            }
        }
        return counter;
    }
}
