package Java.IntegerPalindrome;

public class IntPalindrome {
	public boolean isPalindrome(int input) {
		if (input < 0 || (input != 0 && input % 10 == 0)) {
			return false;
		}

		int reversedInput = 0;

		while (input > reversedInput) {
			//add a 0 to end of reversed input we're building, then populate it with last digit of input
			reversedInput = reversedInput * 10 + input % 10;

			input = input / 10;
		}

		//second comparison cuts off the middle digit if input is odd, since it doesn't matter. ex: 797 -> 77
		return (input == reversedInput || input == reversedInput / 10);
	}
}
