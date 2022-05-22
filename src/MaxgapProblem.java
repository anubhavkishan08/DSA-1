import java.util.Arrays;
import java.util.Scanner;

public class MaxgapProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<2)
            System.out.println("0");
        int max_ele=Integer.MIN_VALUE;
        int min_ele=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             max_ele=Math.max(max_ele,arr[i]);
            min_ele=Math.min(min_ele,arr[i]);
        }
     //   System.out.println(max_ele);
       // System.out.println(min_ele);
        if(max_ele==min_ele)
             System.out.println("0");
        int gap=(max_ele-min_ele)/(n-1);
        if((max_ele-min_ele)%(n-1)!=0)
               gap=gap+1;
       // System.out.println(gap);
        int[] minArr=new int[n];
        int[] maxArr=new int[n];

        for(int i=0;i<n;i++){
            minArr[i]=Integer.MAX_VALUE;
            maxArr[i]=Integer.MIN_VALUE;
        }
        for(int i=0;i<n;i++){
            int bkt=(arr[i]-min_ele)/gap;
          //  System.out.println(bkt);
            minArr[bkt]=Math.min(minArr[bkt],arr[i]);
            maxArr[bkt]=Math.max(maxArr[bkt],arr[i]);
        }
        System.out.println(Arrays.toString(minArr));
        System.out.println(Arrays.toString(maxArr));
        int ans=Integer.MIN_VALUE,prev=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(minArr[i]==Integer.MAX_VALUE)
                continue;
            if(prev==Integer.MIN_VALUE)
                prev=maxArr[i];
            else {
                ans=Math.max(ans,minArr[i]-prev);
                prev=maxArr[i];
            }
        }
        System.out.println(ans);
    }
}
