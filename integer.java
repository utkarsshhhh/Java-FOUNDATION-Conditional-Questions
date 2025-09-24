import java.util.Scanner;

class integer {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of integer : ");
    int a = sc.nextInt();

    if(a>0 & a%2 == 0){
      System.out.println("Positive and even.");
    }
    else if(a<0 & a%2 != 0){
      System.out.println("Negative and odd.");
    }

 }
}