import java.util.ArrayList;

public class Subsetsum {
    public static void main(String[] args){
        int [] arr={1,2,3};
        int n=arr.length;
        int sum=4;
        int i=0,cnt=0;
        int ans=allsubset(arr,n,i,sum);
        System.out.println(ans);
    }
    static int allsubset(int []arr,int n,int i,int remsum){
        ArrayList<Integer> ans=new ArrayList<>();
        if(remsum<0)
            return 0;
        if(remsum==0)
            return 1;
        if(i==n)
            return 0;
        return allsubset(arr,n,i,remsum-arr[i])+allsubset(arr,n,i+1,remsum);
    }
}
