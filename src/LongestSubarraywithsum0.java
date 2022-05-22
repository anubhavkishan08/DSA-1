import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarraywithsum0 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int ps=0,len=0,ans=0;
        for(int i=0;i<n;i++){
            ps+=arr[i];
            if(mp.containsKey(ps)){
                int a=mp.get(ps);
                len=i-a;
                ans=Math.max(ans,len);
            }else
              mp.put(ps,i);
        }

        System.out.println(ans);
    }
}
