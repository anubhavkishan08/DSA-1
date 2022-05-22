import java.util.Scanner;

public class CHOICE {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Weekend Plan");
        System.out.println("Enter 1 for movies");
        System.out.println("Enter 2 for Shopping");
        System.out.println("Enter 3 for Eating Out");
        System.out.println("Enter 4 for No plan");
        int choice =sc.nextInt();

        if(choice==1){
            System.out.println("Going for Movie");
        }
        else if(choice ==2){
            System.out.println("Going for Shopping");
        }
        else if(choice==3){
            System.out.println("Eating Out");
        }
        else{
            System.out.println("Sleep");
        }
    }
}
