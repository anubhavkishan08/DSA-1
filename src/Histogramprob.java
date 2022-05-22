import java.util.Arrays;
import java.util.Scanner;

public class Histogramprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] pmax=new long[n];
        long[] smax=new long[n];
        pmax[0]=arr[0];
        smax[n-1]=arr[n-1];
        for(int i=1;i<=n-1;i++){
            pmax[i]=Math.max(arr[i],pmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            smax[i]=Math.max(arr[i],smax[i+1]);
        }
        long ans=0;
        for(int i=1;i<=n-2;i++){
            long dec_ht=  Math.min(pmax[i],smax[i]);
            if(dec_ht>arr[i])
                ans+=dec_ht-arr[i];
        }
        System.out.println(Arrays.toString(pmax));
        System.out.println(Arrays.toString(smax));
        System.out.println(ans);

    }
}
