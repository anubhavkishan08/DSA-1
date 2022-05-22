import java.util.*;

public class AlyonaandFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, q, r;
        int n = sc.nextInt();
        p=sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        //System.out.println(Arrays.toString(arr));
        long ans=0,final_ans=0;
        while(p>0){
            q=sc.nextInt();
            r=sc.nextInt();
            if(q-1>0){
                ans= arr[r-1] - arr[q-2];
                //System.out.println(ans);
                if(ans>0)
                    final_ans+=ans;}
            else{
                ans=arr[r-1];
              //  System.out.println(ans);
                if(ans>0)
                    final_ans+=ans;
            }
            p--;
        }
        System.out.println(final_ans);
    }
}
