public class ReverseLinkedListRecursion {
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println();
    }
    static Node reverseList(Node head){
        if(head==null || head.next==null)
            return head;
        Node temp=head.next;
        head.next=null;
        Node p=reverseList(temp);
        temp.next=head;
        return p;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        head.next = first;
        first.next = second;
        second.next = third;
        printList(head);
        Node p=reverseList(head);
        printList(p);
    }
}
