import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexographicsubset {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        //int k= sc.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        List<Integer> temp=new ArrayList<>();
        int i=0,sz=0;
        sz=temp.size();
        lexosubset(ans,arr,n,i,temp,sz);
        System.out.println(ans);
    }
    static  void lexosubset( List<List<Integer>> ans,List<Integer> arr,int n,int i,List<Integer> temp,int sz){
        ans.add(new ArrayList<>(temp));/// first print from aux array(temp)
        if(i==n){
            return;
        }
       for(int j=i;j<n;j++){
           temp.add(sz,arr.get(j));
           lexosubset(ans,arr,n,j+1,temp,sz+1);
           temp.remove(temp.size()-1);
       }
    }
}
