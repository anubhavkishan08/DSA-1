import java.util.Stack;

public class QueuewithStacks2 {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int front=0,backendofs1=0;
    void push(int x){
        if(s1.empty() && s2.empty()){
            front=x;
        }else if(s1.empty()){
            backendofs1=x;
        }
        s1.push(x);
    }
    int pop(){
        if(s2.empty()){
            while (!s1.empty()){
                s2.push(s1.peek());
                s1.pop();
            }
        }
        int ans=s2.peek();
        s2.pop();
        if(!s2.empty())
            front= s2.peek();
        else if(!s1.empty())
            front=backendofs1;
        return ans;
    }
    int peek(){
            return  front;
    }
    boolean empty(){
        return s1.empty() && s2.empty();
    }
}
class Test1 {
    public static void main(String[] args) {
        QueuewithStacks2 ob = new QueuewithStacks2();
        ob.push(5);
        ob.push(17);
        ob.pop();
        ob.pop();
        ob.push(4);
        ob.push(7);
        System.out.println(ob.peek());
        System.out.println(ob.s1);
    }
}
