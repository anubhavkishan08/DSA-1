import java.util.HashMap;
import java.util.Scanner;

public class Longesttconsecutivesequenceopti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ls=0,rs=0,val=0,ans=0;
        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr[i])){
                ls = mp.getOrDefault(arr[i] - 1, 0);
                rs = mp.getOrDefault(arr[i] + 1, 0);
                val=ls+rs+1;
              //  System.out.println(ls+" "+rs+" "+val);
                mp.put(arr[i],val);
                mp.put(arr[i]-ls,val);
                mp.put(arr[i]+rs,val);
                ans=Math.max(ans,val);
            }
        }
        System.out.println(mp);
        System.out.println(ans);
    }
}
