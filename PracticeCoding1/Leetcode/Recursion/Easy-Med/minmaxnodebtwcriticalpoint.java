class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode current = head.next;

        int index = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (current.next != null) {

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