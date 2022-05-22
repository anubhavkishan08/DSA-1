import java.util.ArrayList;
import java.util.Scanner;

public class TransformAtoB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long target=sc.nextLong();
        long cnt=0;
        ArrayList<Long> ans=new ArrayList<>();
       transform(n,target,cnt,ans);
          if(ans.size()==0)
              System.out.println("NO");
    }
    static void transform(long n,long target,long cnt,ArrayList<Long> ans){
        int index=0;
        if(n==target){
            cnt+=1;
            ans.add(n);
            System.out.println("YES");
            System.out.println(cnt);
            for (long an : ans) System.out.print(an + " ");
            return;
        }else if(n>target) {
            return;
        }
            ans.add(n);
         transform(n*2,target,cnt+1,ans);
        index = ans.size() - 1;
        ans.remove(index);
         ans.add(n);
         transform(n*10+1,target,cnt+1,ans);
        index = ans.size() - 1;
        ans.remove(index);

    }
}
