import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BinaryForms {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Long> q=new PriorityQueue<>();
        q.add(1L);
        int c=0;
        while (c<n){
            long x=q.peek();
            q.poll();
            System.out.println(x);
            c++;
            q.add(x*10);
            q.add(x*10+1);
        }
    }
}
