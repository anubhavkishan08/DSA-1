import java.util.Scanner;

public class Reverselookuparray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=(i+1)*(n-i)*arr[i];
        }
        System.out.println(ans);
    }
}
