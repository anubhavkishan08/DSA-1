import java.util.HashMap;
import java.util.Scanner;

public class BoxesPacking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        int ans=0;
      for (int a: mp.values()){
          ans=Math.max(ans,a);
      }
       System.out.println(ans);
    }
}
