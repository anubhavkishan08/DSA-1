import java.util.Scanner;

public class PermutationinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1=s1.length(),n2=s2.length();
        int j=0;
        for(int i=0;i<n1;i++){
             j=0;
            if(s2.charAt(i)==s1.charAt(j) || s2.charAt(i)==s1.charAt(n1-1-j)){
                j++;
            }
        }
        for(int i=n1;i<n2;i++){
            j=0;
            if(s2.charAt(i)==s1.charAt(j) || s2.charAt(i)==s1.charAt(n1-1-j)){
                j++;
            }
        }
        if(j==n1-1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
