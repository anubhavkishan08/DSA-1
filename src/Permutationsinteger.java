import java.util.*;
public class Permutationsinteger{

    public static void main(String []args)  throws Exception{

        ArrayList<Integer> nums=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        int n=nums.size();
        int i=0;
        permute(ans,nums,i,n);
        System.out.println(ans);
    }
    static void permute(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> nums,int i,int n){
        ArrayList<Integer> x=new ArrayList<Integer>(nums);
        if(i==n-1){
            ans.add(x);
            return;
        }
        for(int j=i;j<n;j++){
            Collections.swap(x, i, j);
            permute(ans,x,i+1,n);
            Collections.swap(x, i, j);
        }
    }
}