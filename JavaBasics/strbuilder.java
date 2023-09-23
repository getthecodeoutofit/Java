
import java.util.Scanner;

public class strbuilder {
    public static void main(String[] args) {
        // code in java also stored in stack and heap
        StringBuilder s = new StringBuilder("hello");

        // setCharAt(index,char) to change the character in any position
        // insert(index,char)
        // getChar()
        // .delete(starting_index,ending)
        // .append()
        s.append(" bhai");
        System.out.println(s);

    }
}
