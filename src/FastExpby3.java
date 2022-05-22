import java.util.Scanner;

public class FastExpby3 {
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
        int ans=power(n,k/3);
        if(k%3==0)
            return ans*ans*ans;
        else if(k%3==1)
            return ans*ans*ans*n;
        else
            return ans*ans*ans*n*n;
    }
}
