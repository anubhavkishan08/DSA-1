import java.util.*;

public class Multimap {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c= sc.nextInt();
    int[] [] mat=new int[r][c];
    HashMap<Integer, List<Integer>> mp=new HashMap<>();
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j]= sc.nextInt();
            mp.put(i+j,new ArrayList<>());
        }
    }

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mp.get(i+j).add(mat[i][j]);
        }
    }
    int[] arr=new int[r*c];
    int j=0,k=0;
    System.out.println(mp.size());
    System.out.println(mp);
    while (j< mp.size()) {
        for (int i = 0; i < mp.get(j).size(); i++) {
          //  System.out.println(mp.get(j).get(i));
            arr[k]=mp.get(j).get(i);
            k++;
        }
        j++;
    }
    System.out.println(Arrays.toString(arr));
}

}
