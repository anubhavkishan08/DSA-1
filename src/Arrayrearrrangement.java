import java.util.Arrays;
import java.util.Scanner;

public class Arrayrearrrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
      /*  for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp=new int[n];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]=i;
        }*/
        //System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
}
