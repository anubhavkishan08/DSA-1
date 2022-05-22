import java.util.ArrayList;
import java.util.List;

public class Balncedparanthesis {
    public static void main(String[] args){
        int n=1;
        List<String> x=new ArrayList<>();
        String s=" ";
        int i=0,l=0,r=0;
        char[] ans=new char[2*n];
        balancedparanthesis(s,x,ans,n,l,r,i);
        System.out.println(x);
    }
    static void balancedparanthesis(String s,List<String> x,char[] ans,int n,int o,int c,int i) {
        if (o==n && c==n  || i==2*n) {
            s=new String(ans);//convert char in strings.
            x.add(s);
            //System.out.println(s);
            return;
        }
        if (o == c) {
            ans[i] = '{';
            balancedparanthesis(s,x,ans, n, o + 1, c, i + 1);
        } else if (o > c) {
            if (o == n) {
                ans[i] = '}';
                balancedparanthesis(s,x,ans, n, o, c + 1, i + 1);
            } else {
                ans[i] = '}';
                balancedparanthesis(s,x,ans, n, o, c + 1, i + 1);
                ans[i] = '{';
                balancedparanthesis(s,x,ans, n, o + 1, c, i + 1);
            }
        }
    }
}
