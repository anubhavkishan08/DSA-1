import java.util.Arrays;
import java.util.Scanner;

public class Slidingwindowmaxm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(k<=1)
            System.out.println(Arrays.toString(arr));
        else {
            int[] num1 = new int[n - k + 1];
            int sum = 0, j = 0, max_val = Integer.MIN_VALUE;
            for (int i = 0; i < k; i++) {
                max_val = Math.max(max_val, arr[i]);
            }
            num1[j] = max_val;
            j++;
            for (int i = k; i < n; i++) {
                if(arr[i-k]==max_val) {
                    max_val = Integer.MIN_VALUE;
                    max_val = Math.max(arr[i-k+1], max_val);
                    num1[j] = max_val;
                    j++;
                }
                else {
                    max_val = Math.max(arr[i], max_val);
                    num1[j] = max_val;
                    j++;
                }
            }
            System.out.println(Arrays.toString(num1));
        }
    }
}
