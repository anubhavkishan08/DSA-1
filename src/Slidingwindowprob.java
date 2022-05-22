import java.util.Scanner;

public class Slidingwindowprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum=0,j=0,max_val=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        for(int i=k;i<n;i++){
            System.out.println(sum);
            sum+=arr[i]-arr[i-k];
        }
        System.out.println(sum);
    }
}
