import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GcdofarrayusingBUfferreader {
    static long gcd(long a,long b){
        long div=Math.min(a,b);
        long divi=Math.max(a, b);
        while(divi%div!=0){
            long temp=div;
            div=divi%div;
            divi=temp;
        }
        return div;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t>0) {
            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(strs[i]);
            }
            long ans = gcd(arr[0], arr[1]);
            if(arr.length==1){
                System.out.println(arr[0]);
                return;}
            if(arr.length==2){
                System.out.println(ans);
                return;}
            for (int i = 2; i < n; i++) {
                ans = gcd(ans, arr[i]);
            }
            // System.out.println(ans);
            if(ans==1)
                System.out.println("1");
            else
                System.out.println("0");
            t--;
        }
    }
}
