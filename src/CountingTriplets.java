import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        int[] cnt_rem=new int[m];
        int ans=0;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<m;i++){
            cnt_rem[i]=0;
        }
        for(int i=0;i<n;i++){
            cnt_rem[arr[i]%m]++;
        }
        System.out.println(Arrays.toString(cnt_rem));
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int k;  int a=cnt_rem[i];
                if(((i+j)%m)==0)
                    k=0;
                else
                    k=m-((i+j)%m);
                if(k<j) continue;
                if(i==j && i==k)
                   // ans+=(cnt_rem[i]*(cnt_rem[i]-1))/2;
                    ans+=(a*(a-1))/2;
                else  if(i==j)
                   // ans+=(cnt_rem[i]*(cnt_rem[i]-1))/2+cnt_rem[k];
                    ans+=(a*(a-1))/2*cnt_rem[k];
                else if(i==k)
                   // ans+=(cnt_rem[i]*(cnt_rem[i]-1))/2+cnt_rem[j];
                    ans+=(a*(a-1))/2*cnt_rem[j];
                else
                    ans+=cnt_rem[i]*cnt_rem[j]*cnt_rem[k];
            }
        }
        System.out.println(ans);
    }
}
