import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sherlockandhisgirlfriend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] check_Prime=new int[n+2];
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int i=0;i<=n+1;i++)
            check_Prime[i]=1;
       // System.out.println(Arrays.toString(check_Prime));

                for(int i=2;i*i<=(n+1);i++){
                        for (int k = i; k*i  <= n+1; k++) {
                            if(check_Prime[i]==1)
                            check_Prime[k * i] = check_Prime[i]+1;
                        }
                }
        for(int i=1;i<=n;i++)
            hash_Set.add(check_Prime[i+1]);
        System.out.println(hash_Set.size());
        for(int i=1;i<=n;i++)
        System.out.print((" "+check_Prime[i+1]));
    }
}
