import java.util.Scanner;

public class Slidingwindowprob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]==x)
                count++;
        }
        System.out.print(count);
        for(int i=k;i<n;i++){
            if(arr[i-k]==x) {
                count--;
            }
            if(arr[i]==x)
                count++;

            System.out.print(" "+count);
        }
    }
}
