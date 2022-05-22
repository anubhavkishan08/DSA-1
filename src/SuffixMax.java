import java.util.Arrays;
import java.util.Scanner;

public class SuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0, r = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //int idx = sc.nextInt();
        int[] smax = new int[n];
        int[] smin = new int[n];
        smax[n-1] = arr[n-1];
        smin[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            smax[i]=Math.max(arr[i],smax[i+1]);
          //  smin[i]=Math.min(arr[i],smin[i+1]);
        }
        System.out.println(Arrays.toString(smax));
        //System.out.println(Arrays.toString(smin));
    }
}
