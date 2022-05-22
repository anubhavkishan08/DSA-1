/*class Nodes{
    int data;
    Node next;
    Node(int d, Node n){
        this.data=d;
        this.next=n;
    }
}*/


public class Reverselinkedlistbystack {
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println();
    }
    static Node middleOfList(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node reverseList(Node head){         //Iterative methods
        Node curr=head;
        Node prev=null;
        Node temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
          prev=curr;
          curr=temp;
        }
        return prev;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        Node first=new Node (2);
        Node second=new Node(2);
        Node third=new Node(1);
        head.next=first;
        first.next=second;
        second.next=third;
        printList(head);
      /*  Stack<Integer> s=new Stack<>();
        Node curr=head;
        while(curr!=null){
            s.push(curr.data);
            curr=curr.next;
        }
        curr=head;
        while (curr!=null){
            curr.data=s.peek();
            s.pop();
            curr=curr.next;
        }
        printList(head);*/
        Node t=middleOfList(head);
        System.out.println(t.data);
        Node newHead=reverseList(t);
        printList(newHead); int flag=0;
        Node curr=head;
        while (newHead!=null && curr!=null){
            if(newHead.data!=curr.data){
          //      System.out.println(newHead.data +" "+curr.data);
                 flag=1;
               break;}
            newHead=newHead.next;
            curr=curr.next;
        }
        if(flag==0)
        System.out.println("true");
        else
            System.out.println("false");
    }
}
