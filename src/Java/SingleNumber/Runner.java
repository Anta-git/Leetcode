package Java.SingleNumber;

public class Runner {
	public static void main(String[] args) {
		SingleNumber singleNumber = new SingleNumber();

		System.out.println(singleNumber.singleNumber(new int[]{1, 2, 3, 2, 1})); //returns 3
		System.out.println(singleNumber.singleNumber(new int[]{3, 2, 1, 2, 3, 5, 5})); //returns 1
	}
}
