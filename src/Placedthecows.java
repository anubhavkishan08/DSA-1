import java.util.Arrays;
import java.util.Scanner;

public class Placedthecows {
    static boolean func(int[] arr,int mid,int c,int n){
        int cnt=1,prev=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-prev<mid)
                continue;
            else {
                cnt++;
                prev=arr[i];
            }
        }
        return cnt>=c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int l=arr[0],h=0,ans=0;
        for (int i=1;i<n;i++){
            l=Math.min(l,arr[i]);
        }
        h=arr[n-1]-arr[0];
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int c= sc.nextInt();
            int low=l,high=h;
            if(c>n) {
                System.out.println(0);
            }
            else {
                while (low <= high) {
                    int mid = (low + high) / 2;
                    //System.out.println(mid);
                    boolean r = func(arr, mid, c, n);
                    if (!r) {
                        high = mid - 1;
                    } else {
                        boolean r1 = func(arr, mid + 1, c, n);
                        if (!r1) {
                            System.out.println(mid);
                            break;
                        } else {
                            low = mid + 1;
                        }
                    }
                }
            }
            //System.out.println(ans);
        }
    }
}
