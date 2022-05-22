import java.util.Scanner;

public class DigitSumrecursive {
    static long superDigit(long n,int k) {
        long sum=0;
        if(n<10)
            return n;
        else {
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
        }
        return superDigit(sum,k);
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String[]  s= sc.nextLine().split(" ");
         StringBuilder s1= new StringBuilder();
         long sum=0;
         for (int i=0;i<s.length-1;i++){
             s1.append(s[i]);
         }
         for(int i=0;i<s1.length();i++){
             sum+=Integer.parseInt(String.valueOf(s1.charAt(i)));
         }
             int k= Integer.parseInt(s[s.length-1]);
     //   System.out.println(sum);
        sum=sum*k;
       System.out.println(superDigit(sum,k));
    }

}
