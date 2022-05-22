import java.util.PriorityQueue;
import java.util.Queue;

public class StackwithQueue {
    Queue<Integer> q=new PriorityQueue<>();
    Queue<Integer> temp=new PriorityQueue<>();
    void push(int x){
        q.add(x);
    }
    int pop(){
        while (!(q.size() ==1)){
            temp.add(q.poll());
        }
        int ans=q.peek();
        q=temp;
        return ans;
    }
    int peek(){
     return q.peek();
    }
    boolean empty(){
        return q.isEmpty();
    }
}
class  Test3{
    public static void main(String[] args) {
        StackwithQueue ob = new StackwithQueue();
        ob.push(5);
        ob.push(17);
        ob.pop();
        System.out.println(ob.pop());
        ob.push(4);
        ob.push(7);
        System.out.println(ob.peek());
    }
}
