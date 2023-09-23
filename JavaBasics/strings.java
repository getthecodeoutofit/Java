
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String s = "Hello ";

        // strings haves different case methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        name.toUpperCase();
        System.out.println(s + name);
        // charAt finction
        for (int i = 0; i < name.length(); i++) {
            // to get the character at perticular idex
            System.out.print(name.charAt(i) + " ");
        }
        // compairing strings;
        System.out.println("Enter another name to compare: ");
        String name2 = sc.nextLine();
        System.out.println(name.compareTo(name2));

        // getting subtring
        String big = "Hello how are you";
        String sub = big.substring(6, big.length());
        System.out.println(sub);

    }
}
