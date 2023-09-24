import java.lang.*;

class my extends Thread {
    @Override
    public void run() {

        System.out.println("running");
    }

}

public class Multi {
    // using inheritance , we had created Multi class using Inbuild class
    // ThreadS(Overriding)
    // Multitherading in java:
    // Using thread class

    public static void main(String[] args) {
        my m = new my();
        m.run();

    }
}
