import java.util.Arrays;
import java.util.Scanner;

public class MaximizetheExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q,r;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        p= sc.nextInt();
        q=sc.nextInt();
        r=sc.nextInt();
        int[] smax = new int[n];
        int[] pmax = new int[n];

        pmax[0]=p*arr[0];
        smax[n-1]=r*arr[n-1];
        for(int i=1;i<=n-1;i++){
            pmax[i]=Math.max(p*arr[i],pmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            smax[i]=Math.max(r*arr[i],smax[i+1]);
        }
        int ans=0;
        for(int i=1;i<=n-2;i++){
            int x=pmax[i-1]+(q*arr[i])+smax[i+1];
             ans=Math.max(ans,x);
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(pmax));
        System.out.println(Arrays.toString(smax));
    }
}
