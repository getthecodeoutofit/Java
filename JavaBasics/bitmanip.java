
public class bitmanip {
    public static void main(String[] args) {
        int a = 1;
        int b = a << 2;
        // getbit getting bit of the position first bi shifting of 1<< left shift n pos
        // number then AND with the number whom we had to get the bit position ;
        // for eg;
        int n = 5;// 0101
        int pos = 2;
        int shift = 1 << pos;
        if ((n & shift) == 0) {
            System.out.println("Bit is zero");

        } else {
            System.out.println("bit in not zero");
        }

        // in set bit we use OR operaation
        // in clear bit first we do NOT of the 1 shift then AND with original number

        System.out.println(b);
    }
}
