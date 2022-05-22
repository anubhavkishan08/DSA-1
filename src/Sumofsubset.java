import java.util.ArrayList;
import java.util.Scanner;

public class Sumofsubset {
    //static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subsetsum(ans,arr,0,0);
        System.out.println(ans);
    }
    static void subsetsum(ArrayList<Integer> ans,int[] arr,int i,int sum){
        if(i== arr.length){
            ans.add(sum);
            //System.out.println(sum);
            return;
        }
        subsetsum(ans,arr,i+1,sum);
        subsetsum(ans,arr,i+1,sum+arr[i]);
    }
}
