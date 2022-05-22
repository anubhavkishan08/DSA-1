import java.util.Stack;

public class                                                                                                                                                                                                         QueuewithStacks {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int front=0;
    void push(int x){
        if(s1.empty()) {
            front = x;                                                                                                                                                                         
        }
            s1.push(x);
    }
    int pop(){
        int ans=0;
        while (!s1.empty()){
            s2.push(s1.peek());
            s1.pop();
        }
        ans=s2.peek();
        s2.pop();
        while (!s2.empty()){
         if(s1.empty()) {
             front = s2.peek();
             s1.push(s2.peek());
         }
            s2.pop();
        }
        return ans;
    }
    int peek(){
        return front;
    }
    boolean empty(){
        return s1.isEmpty();
    }
}
class Test{
    public static void main(String[] args){
        QueuewithStacks ob=new QueuewithStacks();
        ob.push(5);
        ob.push(17);
        ob.pop();
        ob.push(4);
        ob.push(7);
        System.out.println(ob.peek());
        System.out.println(ob.empty());
    }
}