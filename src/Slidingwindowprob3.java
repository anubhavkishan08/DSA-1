import java.util.Scanner;
//
//Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
//
public class Slidingwindowprob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int cnt_legal=0,count=0,max_cnt=0,ans=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
                cnt_legal++;
        }
        for(int i=0;i<cnt_legal;i++){
            if(arr[i]<=k)
                count++;
        }
        //System.out.println(count);
        max_cnt=Math.max(max_cnt,count);
        for(int i=cnt_legal;i<n;i++){
            if(arr[i-cnt_legal]<=k)
                count--;
            if(arr[i]<=k)
                count++;
            max_cnt=Math.max(max_cnt,count);
            System.out.print(" "+max_cnt);
        }
         ans=cnt_legal-max_cnt;
        // System.out.println(cnt_legal);
      //  System.out.println(max_cnt);
        System.out.println(ans);
    }
}
