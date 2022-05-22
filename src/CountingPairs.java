import java.io.IOException;
import java.util.Scanner;

public class CountingPairs {
    public static void main(String[] args) throws IOException {
      //  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        //int t=Integer.parseInt(br.readLine());
        int t= sc.nextInt();
        while (t>0) {
            //int n =Integer.parseInt(br.readLine());
            int n= sc.nextInt();
            int[] arr = new int[n];
            //String line = br.readLine();
            //String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int[] cnt_Rem = new int[k];
            for (int i = 0; i < k; i++) {
                cnt_Rem[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                cnt_Rem[(arr[i] % k)]++;
            }
            //  System.out.println(Arrays.toString(cnt_Rem));
            int ans = 0;
            ans += (cnt_Rem[0] * (cnt_Rem[0] - 1)) / 2;
            for (int i = 1; i <= ((k / 2) - 1); i++) {
                ans += cnt_Rem[i] * cnt_Rem[k - i];
            }
            if (k % 2 == 0) {
                ans += (cnt_Rem[k / 2] * (cnt_Rem[k / 2] - 1)) / 2;
            } else {
                ans += (cnt_Rem[k / 2] * (cnt_Rem[(k / 2)] + 1)) / 2;
            }
            if(n!=0)
            System.out.println(ans);
            else
                System.out.println(0);
            t--;
        }
    }
}
