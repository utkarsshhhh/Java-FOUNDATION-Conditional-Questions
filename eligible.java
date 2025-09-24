import java.util.Scanner;
public class eligible{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();



        if(age>=18){
            System.out.println("Shery ko vote dijiye.");
        }
        else if(age<18){
            System.out.println("Ghar jaake pogo dekho balak");

        }
    }


    
}