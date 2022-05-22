import java.util.HashMap;
import java.util.Scanner;

public class Contigiousarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0,ans=0;
        for (int i=0;i<n;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
            if(mp.get(0)==mp.get(1)){
                cnt=mp.get(0)+mp.get(1);
            ans = Math.max(ans, cnt);}
            else
                cnt=0;
        }

       System.out.println(ans);
    }
}
