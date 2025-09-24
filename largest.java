import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println("a is greatest.");
        } 
        else if (b>c && b>a) {
            System.out.println("b is greatest.");
        }
        else if(c>a && c>b){
            System.out.println("c is greatest.");
        }

    }
}
