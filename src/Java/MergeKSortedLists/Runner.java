package Java.MergeKSortedLists;

import Java.MergeKSortedLists.MergeLists.ListNode;

public class Runner {
	public static void main(String[] args) {
		ListNode inputNode1 = new ListNode(2, new ListNode(4, new ListNode(5)));
		ListNode inputNode2 = new ListNode(2, new ListNode(3, new ListNode(4)));
		ListNode inputNode3 = new ListNode(1, new ListNode(6));
		ListNode[] input = new ListNode[]{inputNode1, inputNode2, inputNode3};

		MergeLists mergeLists = new MergeLists();

		mergeLists.mergeKLists(input);
	}
}
