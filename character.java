import java.util.*;
public class character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        String value = sc.nextLine();
        char ch = value.charAt(0);

        if(value == "a" || value == "e" || value == "i"|| value == "o"|| value == "u"){
            System.out.println("It is a vowel");
        }
        else if{
            System.out.println("It is a consonant.");
        }
    }
}
