//print all permutation(distinct) of int array (may contain duplicates) with negative nos.
import java.util.*;
public class PermutationsUnique{

    public static void main(String []args){

        ArrayList<Integer> nums=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);

        int n=nums.size();
        int i=0;
        permute(ans,nums,i,n);
        System.out.println(ans);
    }
    static void permute(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> nums,int i,int n){
        ArrayList<Integer> x=new ArrayList<Integer>(nums);
        if(i==n-1){
            ans.add(x);
        }
        int[] count=new int[100];
        int[] counts=new int[100];
        for(int j=i;j<n;j++){
            if(x.get(j)>0){
                if(count[x.get(j)]==0){
                    Collections.swap(x, i, j);
                    permute(ans,x,i+1,n);
                    Collections.swap( x, i, j);
                }
                count[x.get(j)]++;}
            else{
                if(counts[x.get(j)*-1]==0){
                    Collections.swap( x, i, j);
                    permute(ans,x,i+1,n);
                    Collections.swap(x, i, j);
                }
                counts[x.get(j)*-1]++;
            }
        }
    }
}