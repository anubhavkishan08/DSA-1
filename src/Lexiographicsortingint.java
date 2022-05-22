import java.util.*;



public class Lexiographicsortingint{
    public static void main(String []args)  throws Exception{
        ArrayList<Integer> nums=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        nums.add(1);nums.add(2);nums.add(3);
        int n=nums.size();
        permute(ans,nums,0,n);
        System.out.println(ans);
    }
    static void permute(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> nums,int i,int n){
        ArrayList<Integer> x=new ArrayList<Integer>(nums);
        if(i==n-1){
            ans.add(x);
        }
        for(int j=i;j<n;j++){
            rt(x, i, j);
            permute(ans,x,i+1,n);
            lt(x, i, j);
        }
    }
    static void lt(ArrayList<Integer> num, int i,int j)
    {
        int temp=num.get(i);
        for(int k=i;k<j;k++){
            num.set(k,num.get(k+1));
        }
        num.set(j,temp);
    }
    static  void rt(ArrayList<Integer> num, int i,int j)
    {
        int temp=num.get(j);
        for(int k=j-1;k>=i;k--){
            num.set(k+1,num.get(k));
        }
        num.set(i,temp);
    }
}