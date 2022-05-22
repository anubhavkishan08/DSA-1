public class Merge2Lists {
    static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.data+"->");
            //System.out.print(head.random+"|->");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);
        ListNode fifth = new ListNode(6);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        head.random=third;first.random=head;second.random=null;third.random=first;fourth.random=head;fifth.random=fourth;
        printList(head);
        ListNode curr=head;
        ListNode temp=null,p=null,newHead=null;
        while (curr!=null){
            temp=new ListNode(curr.data);
            if(curr==head)
                newHead=temp;
            p=curr.next;
            curr.next=temp;
            temp.next=p;
            //curr=curr.next.next;
            curr=p;
        }
        printList(head);
       curr=head;
        while (curr!=null){
            if(curr.random!=null) {
                curr.next.random = curr.random.next;
            }else {
                curr.next.random=null;
            }
            curr=curr.next.next;
        }
        curr=head;
        ListNode curr1=newHead;
        while (curr1!=null && curr1.next!=null){
            ListNode t=curr1.next;
            curr1.next=curr1.next.next;
            curr.next=t;
            curr1=curr1.next;
            curr=curr.next;
        }
        if(curr!=null)
            curr.next=null;
printList(head); printList(newHead);

    }
}
