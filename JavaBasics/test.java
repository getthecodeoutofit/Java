
import java.lang.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("hello");

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        s = sc.nextLine();
        System.out.println("hello" + s);
        int i;
        System.out.println("Enter the age: ");
        i = sc.nextInt();
        // here after reading the integer variable we will get the extra new line
        // character so if we use the scanner option again it will skip that scanning
        // step;
        // so for this we use the scanner option again;
        System.out.print("Enter the name: ");
        String st = sc.nextLine();

    }
}

/*
 * 
 * '/' is a escape sequence:
 * 
 * 
 * 
 */