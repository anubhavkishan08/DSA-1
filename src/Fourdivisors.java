import java.util.Scanner;

public class Fourdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0, sum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            for (int j = 1; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    if (j != a / j) {
                        //System.out.println(j + " " + a / j);
                        sum += j + a / j;
                        cnt += 2;
                    } else {
                        //  System.out.println(j);
                        sum += j;
                        cnt += 1;
                    }
                }
            }
            //  System.out.println(cnt);
            if (cnt == 4) {
               ans += sum;
             //   System.out.println(sum);
                sum=0;
            }
            sum=0;
            cnt = 0;
        }
        System.out.println(ans);
    }
}

