package Java.RemoveDupesSortedArray;

public class Runner {
    public static void main(String[] args) {
        RemoveDupes removeDupes = new RemoveDupes();
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};

        int dupes = removeDupes.removeDuplicates(input);

        System.out.println(dupes);
    }
}
