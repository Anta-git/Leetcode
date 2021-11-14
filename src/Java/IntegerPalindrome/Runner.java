package Java.IntegerPalindrome;

public class Runner {
    public static void main(String[] args) {
        IntPalindrome palindromeChecker = new IntPalindrome();

        System.out.println(palindromeChecker.isPalindrome(Integer.MAX_VALUE));  //false
        System.out.println(palindromeChecker.isPalindrome(Integer.MIN_VALUE));  //false
        System.out.println(palindromeChecker.isPalindrome(79797));          //true

    }
}
