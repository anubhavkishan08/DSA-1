import java.util.*;

//t.c--O(n*log(logn))+ O(logn)
public class Fastfactorisation {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q= sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        TreeMap<Integer, Integer> freqMap
                = new TreeMap<Integer, Integer>();
    while(q>0) {
        int n1 = sc.nextInt();
        boolean[] check = new boolean[n1 + 1];
        int[] spf = new int[n1 + 1];
        for (int i = 2; i <= n1; i++) {
            check[i] = true;
            spf[i] = -1;
        }
        for (int i = 2; i * i <= n1; i++) {
            if (check[i] == true) {
                for (int j = i; j * i <= n1; j++) {
                    if (check[j * i] == true) {
                        spf[j * i] = i;
                        check[j * i] = false;
                    }
                }
            }
        }
        while (spf[n1] != -1) {
           System.out.println(spf[n1]);
            //list.add(spf[n1]);
            n1 = n1 / spf[n1];
        }
        if (n1 != 1) {
            System.out.println(n1);
          //  list.add(n1);
        }
        q--;
       }
    }
}
