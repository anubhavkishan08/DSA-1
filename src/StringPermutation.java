import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int n=s.length();
        int i=0;
        char[] ch = new char[s.length()];
        for (int j = 0; j < n; j++) {
            ch[j] = s.charAt(j);
        }
       // StringBuilder string = new StringBuilder(s);
        permute(ch,i,n);
    }
    static void permute(char[] ch,int i,int n){
        if(i==n){
            System.out.println(ch);
            return;
        }
        for(int j=i;j<n;j++){
            swap(ch,i,j);
            permute(ch,i+1,j);
            swap(ch,i,j);
        }
    }

    private static char[] swap(char[] s, int i, int j) {
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        //System.out.println(s);
        return s;
    }
}
