
public class LL {
    static class Node {
        int data;
        Node next;

        Node(int item) {
            data = item;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        System.out.print(a.data);
    }
}
