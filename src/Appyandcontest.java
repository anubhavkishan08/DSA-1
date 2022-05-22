import java.util.Scanner;

public class Appyandcontest {
    static long lcm(long a, long b){
        long prod=a*b;
        long div=Math.min(a,b);
        long divi=Math.max(a,b);
        while(divi%div!=0){
            long temp=div;
            div=divi%div;
            divi=temp;
        }
        long ans=prod/div;
        return ans;
    }
    public static void main(String[] args){
        int t;
        Scanner sc=new Scanner(System.in);
        t= sc.nextInt();
        while(t>0){
          long k,n,a,b;
          n=sc.nextLong();
          a=sc.nextLong();
          b=sc.nextLong();
          k=sc.nextLong();
          long cnt1=n/a;
          long cnt2=n/b;
          long cnt3=2*(n/lcm(a,b));
          long ans=cnt1+cnt2-cnt3;
          //System.out.println(ans);
          if(ans>=k)
              System.out.println("Win");
          else
              System.out.println("Lose");
            t--;
        }
    }
}
