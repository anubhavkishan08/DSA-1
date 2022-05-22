import java.util.Scanner;
// int n,a,b;
//find in range(1 to n) that how many no's (or count of no's) are divisible by either a or b;
public class Lcmapplications {
    public static void main(String[] args){
        int n,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int cnt1=n/a;
        int cnt2=n/b;
        int prod=a*b;
        int div=Math.min(a,b);
        int divi=Math.max(a,b);
        while(divi%div!=0){
            int temp=div;
            div=divi%div;
            divi=temp;
        }
        int lcm=prod/div;
        int cnt3=n/lcm;
        int ans=cnt1+cnt2-cnt3;
        System.out.println(ans);
    }
}
