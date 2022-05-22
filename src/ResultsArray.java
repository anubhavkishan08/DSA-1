import java.util.Arrays;
import java.util.Scanner;

public class ResultsArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tot_sum=0,psum=0,ssum=0;
        for(int i=0;i<n;i++){
            tot_sum+=arr[i];
        }
        int abs_diff=0,j=0;
        for (int i=0;i<n;i++){
            ssum=tot_sum-psum-arr[i];
            System.out.println(ssum+" "+psum);
           abs_diff=Math.abs((i*arr[i])-psum+ssum-((n-1-i)*arr[i]));
            res[j]=abs_diff;j++;
            psum+=arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
