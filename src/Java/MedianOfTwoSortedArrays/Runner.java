package Java.MedianOfTwoSortedArrays;

public class Runner {
	public static void main(String[] args) {

		int[] sortedArray1 = new int[]{2,4,6,8,10};
		int[] sortedArray2 = new int[]{1,3,5,7,9};

		SortedArraysMedian medianFinder = new SortedArraysMedian();
		System.out.println(medianFinder.findMedianSortedArrays(sortedArray1,sortedArray2)); //5.5
	}
}
