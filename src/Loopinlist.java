import java.util.HashMap;

public class Loopinlist {
    public static void main(String[] args){
     Node head=new Node(3);
     Node first=new Node(2);
     Node second=new Node(0);
     Node third=new Node(-4);
     Node fourth=new Node(50);
     head.next=first; first.next=second; second.next=third; third.next=fourth; fourth.next=first;

        HashMap<Node,Integer> mp=new HashMap<>();
        Node curr=head; int flag=0;
        while (curr!=null){
            if(mp.containsKey(curr)){
                flag=1;
                break;}
            else
                mp.put(curr,1);

            curr=curr.next;
        } 
        if(flag==0)
        System.out.println("List does not contains loop");
        else
            System.out.println("List contains loop" );
    }
}
