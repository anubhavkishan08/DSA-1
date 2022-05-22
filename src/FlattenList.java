public class FlattenList {
    static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.data+"->");
            //System.out.print(head.random+"|->");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(3);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        second.random=new ListNode(3);
        second.random.random=new ListNode(1);
        second.random.next=new ListNode(4);
        second.random.next.next=new ListNode(5);
        printList(head);
        ListNode curr=head,tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        while(curr!=null){
            if(curr.random!=null){
                tail.next=curr.random;
                curr.random=null;
                while (tail.next!=null){
                    tail=tail.next;
                }
            }
            curr=curr.next;
        }
        printList(head);
    }
}
// Adding random pointers to last of linked list;