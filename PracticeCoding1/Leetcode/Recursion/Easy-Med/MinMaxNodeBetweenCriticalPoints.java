
import java.util.ArrayList;

public class MinMaxNodeBetweenCriticalPoints {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(7);

        int[] result = nodesBetweenCriticalPoints(head);

        System.out.println("Minimum distance: " + result[0]);
        System.out.println("Maximum distance: " + result[1]);
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode current = head.next;

        int index = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (current != null && current.next != null) {

            ListNode next = current.next;

            if ((prev.val < current.val && next.val < current.val) ||
                (prev.val > current.val && next.val > current.val)) {

                list.add(index);
            }

            prev = current;
            current = next;
            index++;
        }

        if (list.size() < 2) {
            return new int[]{-1, -1};
        }

        int max = list.get(list.size() - 1) - list.get(0);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        return new int[]{min, max};
    }
}

