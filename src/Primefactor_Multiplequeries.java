import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Primefactor_Multiplequeries {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int q= Integer.parseInt(br.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        int n1 = 1000000;
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
        while (q>0){
            int n=Integer.parseInt(br.readLine());
            while (spf[n] != -1) {
                  //System.out.println(spf[n]);
                list.add(spf[n]);
                n = n / spf[n];
            }
            if (n != 1) {
                //System.out.println(n);
                list.add(n);
            }
            for (int i=0;i<list.size();i++) {
                if (freqMap.containsKey(list.get(i))) {
                    freqMap.put(list.get(i), freqMap.get(list.get(i)) + 1);
                }
                else {
                    freqMap.put(list.get(i), 1);
                }
            }
            for (Map.Entry entry : freqMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            // System.out.println(freqMap);
            //System.out.println(list);
            freqMap.clear();
            list.clear();
            q--;
        }
    }
}
