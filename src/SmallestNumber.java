import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a,b,c,d;
        a=sc.nextLong();b=sc.nextLong();c= sc.nextLong();d=sc.nextLong();
        char[] sign=new char[3];
        for(int i=0;i<3;i++){
            sign[i]=sc.next().charAt(0);
        }
        long min_ans;
      min_ans=solve1(a,b,c,d,sign,0);
        System.out.println(min_ans);
    }
    static long solve1(long a,long b,long c,long d,char[]sign,int i){
        long res,res1,res2,res3,res4,res5,res6;
        if(sign[i]=='+'){
            res1=solve2(a+b,c,d,sign,i+1);
            res2=solve2(a+c,b,d,sign,i+1);
            res3=solve2(a+d,b,c,sign,i+1);
            res4=solve2(b+c,a,d,sign,i+1);
            res5=solve2(b+d,a,c,sign,i+1);
            res6=solve2(c+d,a,b,sign,i+1);
        }else {
            res1=solve2(a*b,c,d,sign,i+1);
            res2=solve2(a*c,b,d,sign,i+1);
            res3=solve2(a*d,b,c,sign,i+1);
            res4=solve2(b*c,a,d,sign,i+1);
            res5=solve2(b*d,a,c,sign,i+1);
            res6=solve2(c*d,a,b,sign,i+1);
        }
        res=Math.min(res1,Math.min(res2,Math.min(res3,Math.min(res4,Math.min(res5,res6)))));
        //System.out.println(res);
        return res;
    }
        static long solve2(long a,long b,long c,char[]sign,int i){
        long res=0,res1=0,res2=0,res3=0;
            if(sign[i]=='+'){
                 res1=solve3(a+b,c,sign,i+1);
                 res2=solve3(a+c,b,sign,i+1);
                 res3=solve3(b+c,a,sign,i+1);

            }else {
                res1=solve3(a*b,c,sign,i+1);
                res2=solve3(a*c,b,sign,i+1);
                res3=solve3(b*c,a,sign,i+1);
            }
            res=Math.min(res1,Math.min(res2,res3));
       //     System.out.println(res);
            return res;
        }
        static long solve3(long a,long b,char[]sign,int i) {
            long res = 0;
            if (sign[i] == '+') {
                res = a + b;
            } else {
                res = a * b;
            }
            //System.out.println(res);
            return res;
        }
}
