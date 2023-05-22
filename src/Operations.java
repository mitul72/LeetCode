public class Operations {
    public static int length(ListNode head) {
        int count = 0;
        if (head == null) {
            return count;
        }
        while (head != null) {
            head = head.getNext();
            count++;
        }
        return count;
    }

    public static ListNode insertAtKthPostition(ListNode head, int data, int k) {
        if (k < 0 || k > length(head)) {
            System.out.println("k is not correct");
            return head;
        }
        if (k == 0) {
            ListNode node = new ListNode(data);
            node.setNext(head);
            head = node;
        } else {
            ListNode node = new ListNode(data);
            ListNode temp = head;
            int index = 0;
            while (index < k) {
                temp = head.getNext();
                index++;
            }
            node.setNext(temp.getNext());
            temp.setNext(node);

        }
        return head;
    }

    public static ListNode deleteAtKthPostition(ListNode head, int k) {
        return head;
    }

    public static boolean hasLoop(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) return true;
        }
        return false;
    }

    public static ListNode loopStart(ListNode head) {
        if (head == null) {
            return null;
        }
        boolean hasLoop = false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        if (!hasLoop) {
            System.out.println("No loop");
            return null;
        }
        ListNode left = head;
        ListNode right = slow;
        while (left != right) {
            left = left.getNext();
            right = right.getNext();
        }
        return left;

    }

    public static int loopSize (ListNode head) {
        int count = 0;
        return count;
    }
    public static ListNode clone(ListNode head) {
        ListNode tempHead = head;
        ListNode tempHead2 = head;
        ListNode tempHead3 = head;
        ListNode tempHead4 = head;
        ListNode tempHead5 = head;
        ListNode newHead = new ListNode(0);
        while (head!=null) {
            newHead = new ListNode(head.getData());
            newHead.setNext(head.getNext());
            head.setNext(newHead);
            head = newHead.getNext();
        }
        tempHead5 = tempHead5.getNext();
        while (tempHead4!=null && tempHead5!=null) {
            if (tempHead4.getRandom()!=null)
                tempHead5.setRandom(tempHead4.getRandom().getNext());
            tempHead5 = tempHead5.getNext();
        }
        int counter = 0;
        while (tempHead.getNext()!=null && tempHead2!=null) {
            if (counter == 0) {
                tempHead = tempHead.getNext();
                tempHead3 = tempHead;
            }
            ListNode nextNode = tempHead.getNext();
            ListNode nextNode2 = tempHead2.getNext();
            if (tempHead.getNext()!=null) {
                nextNode = tempHead.getNext().getNext();
                nextNode2 = tempHead2.getNext().getNext();
            }
            tempHead.setNext(nextNode);
            tempHead2.setNext(nextNode2);
            tempHead = tempHead.getNext();
            tempHead2 = tempHead2.getNext();
            counter++;
        }
        tempHead = tempHead.getNext();
        tempHead2.setNext(tempHead2.getNext().getNext());

        return tempHead3;
    }
}

