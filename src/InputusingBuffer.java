import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputusingBuffer {
    public static void main (String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int[] arr=new int[a];
        String[] s1 = br.readLine().split(" ");
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);
        int sum=Integer.parseInt(br.readLine());
        int ans=0,i=0,j=a-1;
        while (i<j){
            int cur_sum=arr[i]+arr[j];
            if(cur_sum>sum)
                j--;
            else if(cur_sum<sum)
                i++;
            else {
                if(arr[i]==arr[j]){
                    int len=(j-i+1);
                    ans+=(len*(len-1))/2;
                    break;
                }
                int v1=arr[i],v2=arr[j],c1=0,c2=0;
                while (arr[i]==v1) {
                    c1++; i++;
                }
                while (arr[j]==v2) {
                    c2++;j--;
                }
                ans+=c1*c2;

            }
        }
        System.out.println(ans);
    }
}
