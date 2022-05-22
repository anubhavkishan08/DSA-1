import java.util.Scanner;

public class Maximizek {
    static int check_sum(int[] arr,int n,int k,int x){
        int sum=0;
        if(k==n+1)
            return sum;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>x){
            sum=0;
            return sum;
        }
        else {
            for (int i = k; i < n; i++) {
                sum += arr[i] - arr[i - k];
                if(sum>x){
                    sum=0;
                    break;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int x = sc.nextInt();
            int l = 0, h = n ;
            while (l <= h) {
                int mid = (l + h) / 2;
                int ans = check_sum(arr, n, mid, x);
               // System.out.println(ans);
                if (ans != 0) {
                    int ans1 = check_sum(arr, n, mid + 1, x);
                    if (ans1 == 0) {
                        if(mid==n && ans<x){
                            System.out.println(0);
                            break;}
                        else {
                        System.out.println(mid);
                        break;}
                    } else
                        l = mid + 1;
                } else
                    h = mid - 1;
            }
        }
    }
}
