import java.util.Scanner;
import java.util.Stack;

public class Revrseastack {
    static void pushbottom(Stack<Integer> s,int x){
        if(s.empty()){
          s.push(x);
          return;}
        int y=s.peek();
        s.pop();
        pushbottom(s,x);
        s.push(y);
    }
    static void   reversestack(Stack<Integer>s){
        if(s.empty())
            return;
        int y=s.peek();
        s.pop();
        reversestack(s);
        pushbottom(s,y);
        System.out.println(s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(4);st.push(5);st.push(6);st.push(8);
       // System.out.println(st.peek());
        reversestack(st);
        //System.out.println(reversestack(st));
    }
}
