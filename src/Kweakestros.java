import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.*;

public class Kweakestros {
    static int b_search(int[] arr,int i,int c,int key){
        int l=0,h=c-1,ans=0;
        while (l<=h) {
            int mid = (l + h) / 2;
            if(l==h)
            {
                ans=mid;
                break;
            }
            if (arr[mid] < key)
                h = mid - 1;
            else {
                if (arr[mid+1] != key || mid==c-1) {
                    ans = mid;
                    break;
                }
                else {
                    l=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) throws  IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        input = (reader.readLine().split(" "));
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int[][] arr = new int[r][c];
        String[] tmp;
        for (int i = 0; i < r; i++) {
            tmp = (reader.readLine().split(" "));
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(tmp[j]);
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.print("\n");
            System.out.println(Arrays.toString(arr));
        }
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < r; i++) {
            int idx_one = b_search(arr[i], 0, c, 1);
            l.put(i, idx_one + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(l.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    if (o1.getKey() < o2.getKey()) return -1;
                    return 1;
                }
                if (o1.getValue() < o2.getValue()) return -1;
                return 1;
            }
        });
        for (Map.Entry<Integer, Integer> e : list) {
            System.out.print(e.getKey() + " ");
        }
    }
}

