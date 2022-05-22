import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[] [] mat=new int[r][c];
        int[]row=new int[r];
        int[] col=new int[c];
        int[] maj_d=new int[r+c];
        int[] min_d=new int[r+c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                    maj_d[i-j+r-1]=1;
                    min_d[i+j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1 || maj_d[i-j+r-1]==1 || min_d[i+j]==1){
                    mat[i][j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
