import java.util.Arrays;
import java.util.Scanner;

public class MagicFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] p_xor=new int[n];
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                p_xor[i]=arr[i]^((i+1)%j);
            }
        }
        System.out.println(Arrays.toString(p_xor));
        long ans=p_xor[0];
        for(int i=1;i<n;i++){
            ans=ans^p_xor[i];
        }
        System.out.print(ans);
    }
}
