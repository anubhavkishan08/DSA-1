import java.util.Arrays;
import java.util.Scanner;

public class Prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0,r=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q=sc.nextInt();
      //  System.out.println(Arrays.toString(arr));
        for(int i=1;i< arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<q;i++){
             l= sc.nextInt();
             r= sc.nextInt();
            if(l>0) {
                int a = arr[r] - arr[l - 1];
                System.out.println(a);
            }
            else {
                System.out.println(arr[r]);
            }
        }
    }
}
