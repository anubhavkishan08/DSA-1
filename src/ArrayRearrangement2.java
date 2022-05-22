import java.util.Arrays;
import java.util.Scanner;

public class ArrayRearrangement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            int old=arr[i]%n;
            arr[old]=n*i+arr[old];
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
