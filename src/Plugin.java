import java.util.Scanner;
import java.util.Stack;

public class Plugin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(st.empty() || st.peek()!=s.charAt(i))
                st.push(s.charAt(i));
            else {
                if (st.peek() == s.charAt(i))
                    st.pop();
            }
        }
        while (st.size()>0){
            s1.append(st.peek());
            st.pop();
        }
        System.out.println(s1);
    }
}
