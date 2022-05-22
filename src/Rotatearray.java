import java.util.Arrays;
import java.util.Scanner;

public class Rotatearray {
    static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();
        if(k>n)
            k=k%n;
            reverse(arr, 0, n - k - 1);
            reverse(arr, n - k, n - 1);
            reverse(arr, 0, n - 1);

       System.out.println(Arrays.toString(arr));
    }
}
