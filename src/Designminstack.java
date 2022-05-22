import java.util.Scanner;
import java.util.Stack;

public class Designminstack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        int t;
        t= sc.nextInt();
        while(t>0){
            int q=sc.nextInt();
            if(q==1){
                int ele= sc.nextInt();
                s.push(ele);
                if(s1.empty())
                    s1.push(ele);
                else{
                    int max=Math.max(ele,s1.peek());
                    s1.push(max);
                }
            }
            else if(q==2){
                s.pop();
                s1.pop();
            }
            else if(q==3) {
                System.out.println(s1.peek());
            }
            t=t-1;
        }
    }
}
