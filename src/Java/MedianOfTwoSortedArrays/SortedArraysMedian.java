package Java.MedianOfTwoSortedArrays;

public class SortedArraysMedian {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//Used to prevent us from potentially going out of bounds of the arrays
		int nums1Index = 0;
		int nums2Index = 0;

		int combinedLength = nums1.length + nums2.length;

		int left = 0;
		int right = 0;

		for (int i = 0; i <= (combinedLength / 2); i++) {
			left = right;
			if (nums1Index == nums1.length) {
				right = nums2[nums2Index];
				nums2Index++;
			} else if (nums2Index == nums2.length) {
				right = nums1[nums1Index];
				nums1Index++;
			} else if (nums1[nums1Index] < nums2[nums2Index]) {
				right = nums1[nums1Index];
				nums1Index++;
			} else {
				right = nums2[nums2Index];
				nums2Index++;
			}
		}

		//need to divide to find median
		if (combinedLength % 2 == 0) {
			return ((float) (left + right)) / 2;
		}

		//no need for division
		return right;
	}
}
