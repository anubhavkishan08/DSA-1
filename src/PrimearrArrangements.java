import java.util.Scanner;

public class PrimearrArrangements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean[] check= new boolean[n + 1];
        for(int i=1;i<=n;i++)
            check[i]=true;
        check[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(check[i]==true) {
                for (int j = i; j * i <= n; j++) {
                    check[j * i] = false;
                }
            }
        }
        int cnt_p=0,cnt_np=0;
        for(int i=2;i<=n;i++){
            if(check[i]==true)
                cnt_p++;
        }
        cnt_np=n-cnt_p;
        long ans=1;
        int mod=1000000007;
        System.out.println(cnt_p+" "+cnt_np);
        for(int i=2;i<=cnt_p;i++){
            ans=(ans*i)%mod;
        }

        for(int i=2;i<=cnt_np;i++){
            ans=(ans*i)%mod;
        }
        System.out.println(ans);
    }
}
