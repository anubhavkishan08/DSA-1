import java.util.Arrays;
import java.util.Scanner;

public class Arrayrearrangement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=0) {
                int idx = arr[i];
                int x = i;
                while (idx != i) {
                    int temp = arr[idx];
                    arr[idx] = -(x + 1);
                    x = idx;
                    idx = temp;
                //    System.out.println(Arrays.toString(arr));
                }
                arr[idx]=-(x+1);
                //System.out.println(Arrays.toString(arr));
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=(arr[i]*(-1))-1;
        }
       System.out.println(Arrays.toString(arr));
    }
}
