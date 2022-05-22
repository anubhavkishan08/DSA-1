import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Maximumelementineverywindow {
    public static  void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Deque<Integer> dq=new ArrayDeque<>();
     //   System.out.println(dq);
        for(int i=0;i<k;i++){
            while (!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();}
                dq.add(i);
        }
        //System.out.println(dq);
        for(int i=k;i<n;i++){
            System.out.println(arr[dq.peekFirst()]);
            if(i-k==dq.peekFirst())
                dq.pollFirst();
            while (!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();}
            dq.add(i);
        }
        System.out.println(arr[dq.peekFirst()]);
    }
}
