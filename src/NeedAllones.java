import java.util.Scanner;
import java.util.Stack;

public class NeedAllones {
    static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n]; int[]pse=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.empty() && heights[st.peek()]>heights[i])
            {
                nse[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            nse[st.peek()]=n;
            st.pop();
        }
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.empty() && heights[st.peek()]>heights[i])
            {
                pse[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            pse[st.peek()]=-1;
            st.pop();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int area=(nse[i]-pse[i]-1)*heights[i];
            ans=Math.max(ans,area);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] ans=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            for(int j=1;j<r;j++){
                if(ans[j][i]==1)
                    ans[j][i]=1+ans[j-1][i];
                else
                    ans[j][i]=0;
            }
        }
        int maxarea=0;
        for(int i=0;i<r;i++){
            int area=largestRectangleArea(ans[i]);
            maxarea=Math.max(maxarea,area);
        }
        System.out.println(maxarea);
    }
}
