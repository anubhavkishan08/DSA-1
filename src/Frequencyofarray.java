import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Frequencyofarray {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        int[] freq=new int[n];
        String[] s=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            freq[i]=0;
            arr[i]=Integer.parseInt(s[i]);
        }
        for (int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        System.out.print(Arrays.toString(freq));
    }
}
