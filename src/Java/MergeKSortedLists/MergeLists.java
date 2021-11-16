package Java.MergeKSortedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/merge-k-sorted-lists/
public class MergeLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}

		PriorityQueue<ListNode> pQueue = new PriorityQueue<>(lists.length, Comparator.comparingInt(o -> o.val));

		ListNode mergedLN = new ListNode(0);
		ListNode tail = mergedLN;

		for (ListNode listNode : lists) {
			if (listNode != null) {
				pQueue.add(listNode);
			}
		}

		while (!pQueue.isEmpty()) {
			tail.next = pQueue.poll();
			tail = tail.next;

			if (tail.next != null) {
				pQueue.add(tail.next);
			}
		}

		//calling .next here to skip the initial value of 0
		return mergedLN.next;
	}


	//Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
