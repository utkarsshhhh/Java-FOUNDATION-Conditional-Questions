import java.util.Scanner;
public class height {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();


        if(height<150){
            System.out.println("He is dwarf");
        }
        else if(height<200 && height>150){
            System.out.println("He is average");
        }
        else if(height>150){
            System.out.println("He is tall");
        }
        else{
            System.out.println("Invalid height...");
        }

    }
}
