import javax.swing.*;
import java.net.SocketOption;
import java.util.ArrayList;

public class arraylist
{
    //DYNAMIC Array
    public static void main(String[] args) {
        int [] arr = new int[10];
        System.out.println(arr);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        System.out.println(a.size());
        System.out.println(a);
    }

}
