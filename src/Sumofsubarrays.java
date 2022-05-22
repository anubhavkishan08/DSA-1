import java.util.Scanner;

public class Sumofsubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long  sum=0;
        int ans=0;
        int m=(10000007);//(10^9+7)

        for(long i=0;i<n;i++) {
            sum = (((i + 1) % m) * ((n - i) % m) * (arr[(int) i]) % m) % m;
            ans = (int) ((ans % m) + (sum % m));
        }
        System.out.println(ans);
    }
}
