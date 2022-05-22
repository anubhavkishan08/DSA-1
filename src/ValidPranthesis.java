import java.util.Scanner;

public class ValidPranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
            System.out.println(s1);
            int openb = 0, closeb = 0, opencb = 0, closecb = 0, openfullb = 0, closefullb = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == '(')
                    openb++;
                else if (s1.charAt(j) == '{')
                    opencb++;
                else if (s1.charAt(j) == '[')
                    openfullb++;
                else if (s1.charAt(j) == ')')
                    closeb++;
                else if (s1.charAt(j) == '}')
                    closecb++;
                else if (s1.charAt(j) == ']')
                    closefullb++;
            }
            System.out.println(openb + " " + closeb + " " + opencb + " " + closecb + " " + openfullb + " " + closefullb);
              if(closeb>openb || closecb>opencb || closefullb>openfullb){
                   flag=1;
                   break;}
               else
                   flag=0;
       }
       if(flag==1)
           System.out.println("Not");
       else
           System.out.println("Yes");
    }
}
