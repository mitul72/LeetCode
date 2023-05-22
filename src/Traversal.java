public class Traversal {
    public static void traverse(ListNode head) {
        if(head==null){
            return;
        }
        while(head!=null) {
            if(head.getNext()!=null) {
                System.out.print(head.getData() + " -> ");
            }
            else {System.out.print(head.getData());}
            head = head.getNext();
        }
    }
}
