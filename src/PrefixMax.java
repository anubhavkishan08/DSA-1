import java.util.Arrays;
import java.util.Scanner;

public class PrefixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0, r = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        int[] pmax=new int[n];
        int[] pmin=new int[n];
        pmax[0]=arr[0];
        pmin[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pmax[i]=Math.max(pmax[i-1],arr[i]);//for prefix max
            pmin[i]=Math.min(pmin[i-1],arr[i]);//for prefix min
            /*if(arr[i]>pmax[i-1])
            pmax[i]=arr[i];
            else
                pmax[i]=pmax[i-1];*/
        }
        System.out.println(Arrays.toString(pmax));
        System.out.println(Arrays.toString(pmin));
        System.out.println(pmax[idx]);
        System.out.println(pmin[idx]);
    }
}
