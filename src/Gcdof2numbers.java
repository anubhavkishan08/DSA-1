import java.util.Scanner;

public class Gcdof2numbers {
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int temp,div,divi;
        div=Math.min(a,b);
        divi=Math.max(a,b);
        if(div==0)
            System.out.println(divi);
        if(divi==0)
            System.out.println(div);
        while( divi%div!=0){
        //    temp=divi;
          //  divi=div;
            //div=temp%div;
            //or
            temp=div;
            div=divi%div;
            divi=temp;
        }
        System.out.println(div);
    }
}
