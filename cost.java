import java.util.Scanner;
public class cost{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
       int cp = sc.nextInt();


        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();

         int profit = sp - cp;

         if(profit>cp){
            System.out.println("Profit");
         }
         else if(profit>sp){
            System.out.println("loss");
         }


    }
}