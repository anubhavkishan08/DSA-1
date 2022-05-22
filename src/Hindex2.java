import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hindex2 {
    static int hindex(int[] arr,int n){
        int l=0,h=n-1,ans=0;
        while (l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==mid+1 && n-1-mid==arr[mid]-1){
                  ans= mid;
                break;}
            else if(mid+1<arr[mid]){
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int[] arr=new int[a];
        String[] s1 = br.readLine().split(" ");
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        int ans=hindex(arr,a);
        System.out.println(arr[ans]);
    }
}
