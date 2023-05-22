public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode Node1 = new ListNode(6);
        ListNode Node2 = new ListNode(7);
        ListNode Node3 = new ListNode(8);
        head.setNext(Node1);
        head.setRandom(Node2);

        Node1.setNext(Node2);
        Node1.setRandom(head);

        Node2.setNext(Node3);
        Node2.setRandom(Node1);

        Node3.setRandom(Node2);
//        Node3.setNext(Node1);
        Traversal.traverse(head);
        System.out.println();
        head = Operations.insertAtKthPostition(head,23,2);
        Traversal.traverse(head);
        System.out.println();
//        System.out.println(Operations.length(head));
        ListNode newClone = Operations.clone(head);
        System.out.println(newClone);
        System.out.println(head.getNext().getRandom());
//        Traversal.traverse(newClone);
//        Traversal.traverse(newLinkList);
//        System.out.println(Operations.loopStart(head).getData());
        System.out.println(newClone.getRandom().getData());
    }
}
