import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlmostPrime {
    static int almostPrime ( int n){
        Set<Integer> hash_Set = new HashSet<Integer>();
        int cnt = 0;
        int num = n;
        for (int i = 2; i * i <= num; i++) {
            while (n % i == 0) {
                hash_Set.add(i);
                //System.out.println(i);
                n = n / i;
            }
        }
        if (n != 1)
            // System.out.println(n);
            hash_Set.add(n);
        if (hash_Set.size() == 2) {
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(almostPrime(i)==1)
                count++;
        }
        System.out.println(count);
    }
}
