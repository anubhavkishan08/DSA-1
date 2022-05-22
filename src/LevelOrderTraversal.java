import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new PriorityQueue<>();
        q.add(0);
        int c=0;
        while(c<n){
            int x=q.peek();
            if(x!=0){
                System.out.println(x);
                c++;}
            q.poll();
            q.add(x*10+1);
            q.add(x*10+2);
            q.add(x*10+3);
        }
    }
}
