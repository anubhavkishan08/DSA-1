import java.util.HashMap;
import java.util.Scanner;

public class Longesttconsecutivesequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mp.put(arr[i],0);
        }
        int min_ele=Integer.MAX_VALUE;
        int max_ele=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             min_ele=Math.min(min_ele,arr[i]);
             max_ele=Math.max(max_ele,arr[i]);
         }
         int cnt=0,ans=0;
         for(int i=min_ele;i<max_ele;i++){
             if(mp.containsKey(i)) {
                 cnt++;
                 ans = Math.max(ans, cnt);
             }else
                 cnt=0;
         }
         System.out.println(ans);
    }
}
