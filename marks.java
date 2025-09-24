import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of mathematics: ");
        int maths = sc.nextInt();

        System.out.println("Enter the marks of science: ");
        int science = sc.nextInt();

        System.out.println("Enter the marks of english: ");
        int english = sc.nextInt();

        System.out.println("Enter the marks of hindi: ");
        int hindi = sc.nextInt();

        double percentage = (maths + science + english + hindi) / 4;

        if (percentage < 35) {
            System.out.println("Division - F");
        } else if (percentage < 45) {
            System.out.println("Division - D");
        } else if (percentage < 55) {
            System.out.println("Division - c");
        } else if (percentage < 65) {
            System.out.println("Division - B");
        } else if (percentage > 75 && percentage <= 100) {
            System.out.println("Division - A");
        }
    }
}
