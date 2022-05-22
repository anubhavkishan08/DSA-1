import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Allsubsetofset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int [] nums={1,2,3};
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();
         int n=nums.length;
         int i=0;
         pass(ans,temp,nums,i,n);
         System.out.println(ans);
    }
    static void pass(List<List<Integer>> ans,List<Integer> temp,int [] nums,int i,int n){
        if(i==n){
          //ans.add(temp);
           ans.add(new ArrayList<Integer>(temp));
            return;
        }
        pass(ans,temp,nums,i+1,n);
        temp.add(nums[i]);
        pass(ans,temp,nums,i+1,n);
       //  temp.remove(i);
        temp.remove(new Integer(nums[i]));

    }
}
