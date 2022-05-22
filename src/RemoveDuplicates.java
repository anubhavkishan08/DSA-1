import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int []freq=new int[26];
        int []pres_char=new int[26];
        for(int i=0;i<26;i++)
            pres_char[i]=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        st.push(s.charAt(0));
        freq[s.charAt(0)-'a']--;
        pres_char[s.charAt(0)-'a']=1;
        for(int i=1;i<s.length();i++){
            freq[s.charAt(i)-'a']--;
            if(pres_char[s.charAt(i)-'a']==1) continue;
            while (!st.empty() && s.charAt(i)<st.peek() && freq[st.peek()-'a']>0){
                pres_char[st.peek()-'a'] = 0;
                st.pop();
            }
            st.push(s.charAt(i));
            pres_char[s.charAt(i)-'a']=1;
            }
      //  System.out.println(st);
        StringBuilder ans=new StringBuilder();
        Stack<Character> stk=new Stack<>();
        while (!st.empty()){
            stk.push(st.peek());
            st.pop();
         }
        while (!stk.empty()){
            ans.append(stk.peek());
            stk.pop();
        }
     System.out.println(ans);
    }
}
