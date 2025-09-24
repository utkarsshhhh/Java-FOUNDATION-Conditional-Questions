
import java.util.Scanner;

public class equal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter the second integer: ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("The two integers are equal.");
        }
        else{
            System.out.println("The two integers are not equal.");
        }



    }
}