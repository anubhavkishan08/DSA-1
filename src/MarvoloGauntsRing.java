import java.util.Scanner;

public class MarvoloGauntsRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p,q,r;
        int n = sc.nextInt();
        p= sc.nextLong();
        q=sc.nextLong();
        r=sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] smax = new long[n];
        long[] pmax = new long[n];

        pmax[0]=p*arr[0];
        smax[n-1]=r*arr[n-1];
        for(int i=1;i<=n-1;i++){
            pmax[i]=Math.max(p*arr[i],pmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            smax[i]=Math.max(r*arr[i],smax[i+1]);
        }
        long ans=Long.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            long x=pmax[i]+(q*arr[i])+smax[i];
            ans=Math.max(ans,x);
        }
        System.out.println(ans);
        //  System.out.println(Arrays.toString(pmax));
        //System.out.println(Arrays.toString(smax));
    }
}
