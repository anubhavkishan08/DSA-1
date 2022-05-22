class Node{

    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class LinkedList2 {
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println();
    }
    static Node insertatFirst(Node head, int data){
        Node n=new Node(data);
        n.next=head;
        //head=n;
        return n;
       //printList(head);
    }
    static Node insertatLast(Node head,int d){
        Node n=new Node(d);
        while(head.next!=null){
            head=head.next;
        }
        head.next=n;
        return head;
    }
    static Node insertatk(Node head,int k,int d){
        Node temp=new Node(d);
        if(k==1){
            temp.next=head;
            return temp;
        }else{
            for(int i=0;i<k-2;k++){
                head=head.next;
            }
            temp.next=head.next;
            head.next=temp;
            return temp;
        }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        Node second=new Node(2);
        head.next=second;
        Node third =new Node(3);
        second.next=third;
         printList(head);
          Node temp= insertatFirst(head,5);
           head=temp;
           printList(head);
           //System.out.println(insertatLast(head,20));
           insertatLast(head,20);
           printList(head);
           insertatk(head,2,80);
           printList(head);
    }
}
