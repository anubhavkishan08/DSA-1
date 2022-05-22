import java.util.Scanner;

public class Gcdofarray {
    static long gcd(long a,long b){
        long div=Math.min(a,b);
        long divi=Math.max(a, b);
        while(divi%div!=0){
            long temp=div;
            div=divi%div;
            divi=temp;
        }
        return div;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long ans = gcd(arr[0], arr[1]);
            if(arr.length==1)
                System.out.println(arr[0]);
            if(arr.length==2)
                System.out.println(ans);
            for (int i = 2; i < n; i++) {
                ans = gcd(ans, arr[i]);
            }
           // System.out.println(ans);
            if(ans==1)
                System.out.println("1");
            else
                System.out.println("0");
            t--;
        }
    }
}
