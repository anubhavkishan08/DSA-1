import java.util.Scanner;

//in an array return 1 if there is any subsequence of array with gcd=1 otherwise return 0;
public class Gcdmoreques {
    static int gcd(int a,int b){
        int div=Math.min(a,b);
        int divi=Math.max(a, b);
        while(divi%div!=0){
            int temp=div;
            div=divi%div;
            divi=temp;
        }
        return div;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = gcd(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            ans = gcd(ans, arr[i]);
        }
        if(ans==1)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
