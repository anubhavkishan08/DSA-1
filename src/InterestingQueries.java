import java.util.HashMap;
import java.util.Scanner;

public class InterestingQueries {
     static long solve(long temp) {  //converting number to binary
         long m, ans;
        m = 1; ans = 0;  // if num is 241 then it's binary according to ques -001-1
        while (temp>0) {  //if num is 123 then it's binary according to ques -101--5
            ans = ((temp % 10) & 1)*m;
          //  System.out.println(ans);
            m *= 2;
            temp /= 10;
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashMap<Long,Integer> mp=new HashMap<>();
        while (t>0){
            char c=sc.next().charAt(0);
            if(c=='+'){
                long n=sc.nextLong();
                n=solve(n);
                mp.put(n,mp.getOrDefault(n,0)+1);
                 System.out.println(n);
            }else if(c=='-'){
                long n=sc.nextLong();
                n=solve(n);
                 if(mp.containsKey(n))
                {
                    int cnt=mp.get(n);
                    cnt=cnt-1;
                    mp.put(n,cnt);
                }
            }
            else if(c=='?'){
                int cnt=0;
                long n= sc.nextLong();
                n=solve(n);
                if(mp.containsKey(n)){
                    cnt+=mp.get(n);
                }
                System.out.println(cnt);
            }

            t--;
        }
    }
}
