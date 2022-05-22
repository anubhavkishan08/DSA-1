import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Colorfulfield {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int t=sc.nextInt();
        n=n%3;
        m=m%3;
        String[][]field=new String[n+1][m+1];
        //ArrayList<ArrayList<String>> field = new ArrayList<ArrayList<String>>();
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Carrots"); fruits.add("Kiwis"); fruits.add("Grapes");
        while(k>0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            a=a%3;
            b=b%3;
            field[a][b]="Waste";
            k--;
        }
        int c=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
             if(field[i][j]!="Waste") {
                 field[i][j] = fruits.get(c);
                 c++;
                 if(c>= fruits.size())
                     c=0;
             }
            }
        }
        while(t>0){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(field[x%3][y%3]);
            t--;
        }
    }
}
//optimise it using modulus/....