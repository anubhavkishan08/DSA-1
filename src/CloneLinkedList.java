import java.util.HashMap;
class ListNode{
    ListNode next; ListNode random;
    int data;
    ListNode(int data){
        this.data=data;
        this.next=null;
        this.random=null;
    }
}
public class CloneLinkedList {
    static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.data+"->");
            //System.out.print(head.random+"|->");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode head=new ListNode(4);
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(4);
        ListNode third=new ListNode(2);
        ListNode fourth=new ListNode(1);
        ListNode fifth=new ListNode(6);
        head.next=first;first.next=second;second.next=third;third.next=fourth;fourth.next=fifth;
        head.random=third;first.random=head;second.random=null;third.random=first;fourth.random=head;fifth.random=fourth;

        ListNode curr=head,temp=null,prev=null,newhead=null;
        HashMap<ListNode,ListNode> mp=new HashMap<>();
       // HashMap<Integer,Integer> mp1=new HashMap<>();
        while (curr!=null){
            temp=new ListNode(curr.data);
            mp.put(curr,temp);
        //    mp1.put(curr.data,temp.data);
            if(prev==null){
                newhead=temp;
                prev=temp;
            }else {
                prev.next=temp;
                prev=temp;
            }
            curr=curr.next;
        }
        printList(head);
        printList(newhead);
        System.out.println(mp);
        //System.out.println(mp1);
        ListNode curr1=head,curr2=newhead;
        while (curr1!=null){
            curr2.random=mp.get(curr1.random);
            curr1=curr1.next;
            curr2=curr2.next;
        }

    }
}
