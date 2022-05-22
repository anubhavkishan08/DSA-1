import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Firstnegativeinteger {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0)
                dq.addLast(i);
        }
        for(int i=k;i<n;i++){
                                                                                               }
        if(dq.isEmpty())
            System.out.println("0");
        else
            System.out.println(arr[dq.peekFirst()]);
    }
}
