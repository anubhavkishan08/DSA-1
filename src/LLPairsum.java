import java.util.HashMap;

public class LLPairsum {
    public static void main(String[] args){
        Node head=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        Node fourth=new Node(5);
        head.next=first; first.next=second; second.next=third; third.next=fourth;
        Node curr=head;
        int sum=6;
        HashMap<Integer,Node> mp=new HashMap<>();
        while (curr!=null){
            mp.put(curr.data,curr);
            curr=curr.next;
        }
        curr=head;
        int flag=0;
        while (curr!=null){
            if(mp.containsKey(sum-curr.data)) {
             flag=1;
                break;
            }
            curr=curr.next;
        }
        if(flag==1)
        System.out.println("Found"+" "+curr.data+" "+(sum-curr.data));
        else
            System.out.println("Not found");
    }
}
