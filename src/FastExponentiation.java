import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = power(n, k);
        System.out.println(ans);
    }
    static int power(int n, int k) {
        if(k==1)
            return n;
        int ans=power(n,k/2);
        if(k%2==0)
            return ans*ans;
        else
            return ans*ans*n;
    }
}
