public class FlattenList2 {
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
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(19);
        ListNode third = new ListNode(28);
        head.next = first;
        first.next = second;
        second.next = third;
        head.random=new ListNode(7);
        head.random.random=new ListNode(8);
        head.random.random.random=new ListNode(30);
        second.random=new ListNode(22);
        second.random.random=new ListNode(50);
        printList(head);
        ListNode curr=head,temp=null;
        while(curr!=null){
            if(curr.random!=null){
                temp=curr.next;
                curr.next=curr.random;
                while (curr.random.next!=null){
                    curr.random=curr.random.next;}
                curr.random.next=temp;
            }
            curr=curr.next;
        }
        printList(head);
    }
}
//Adding the bootom pointer to next node of curr pointer
// flatten the list;
