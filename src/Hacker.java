import java.util.Scanner;

public class Hacker {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  s= sc.nextLine();
        String s1="";
        int k=0;
        if(sc.hasNextInt())
        {
            k = sc.nextInt();
        }

        //  int k=sc.nextInt();
        for(int i=0;i<k;i++)
            s1+=s;
        System.out.println(superDigit(s1));
        // superDigit(s1);
    }
    static int superDigit(String n) {
        int ans=0;
        String n1="";
        if(n.length()==1){
            //ans= Integer.parseInt(n1);
            //  System.out.println(n);
            return Integer.parseInt(n);
        }
        for (int i = 0; i < n.length(); i++)
            ans += Integer.parseInt(String.valueOf(n.charAt(i)));
        // System.out.println(ans);
        n1 = String.valueOf(ans);
        //   System.out.println(n1);
        return superDigit(n1);
    }
}
