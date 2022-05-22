import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CountingPrimes {
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
                int n= 1000000;
                int cnt=0;
                boolean[] check= new boolean[n + 1];
            ArrayList<Integer> count_Prime=new ArrayList<>();
            for(int i=1;i<=n;i++)
                    check[i]=true;
                check[1]=false;
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(check[i]==true) {
                        for (int j = i; j * i <= n; j++) {
                            check[j * i] = false;
                        }
                    }
                }
            for (int i = 0; i <= n; i++) {
                if (check[i] == true) {
                    cnt++;
                    count_Prime.add(cnt);
                } else {
                    count_Prime.add(cnt);
                }
            }

                while (t>0) {
                    int n1= Integer.parseInt(br.readLine());
                        System.out.println(count_Prime.get(n1));
                    t--;
                }
        }
}
