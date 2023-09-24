
public class LL {
    public static class Node {
        int data;
        Node next;

        Node(int item) {
            data = item;
        }
    }



    public static Node insert(Node T){
        System.out.print("Enter the item to inset: ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int item = s.nextInt();
        s.nextLine();
        Node a = new Node(item);
        Node Temp = T;
        a.next = null;
        if(T == null){

            T = a;
        }
        else{
            while(Temp.next != null) {
                Temp = Temp.next;
            }
            Temp.next=a;
        }
        return T;
    }
    static void displayll(Node t){
        if(t==null){
            System.out.println("Node is Empty Nothing to Print: ");
            return;
        }

        while(t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();

    }

    static Node pop(Node t){
        System.out.println("Deleting the item.....");
        Node Temp = t;
        if(Temp==null){
            System.out.println("The Node is Empty: ");
            return null;
        }
        else if(Temp.next == null) {
            return null;
        }
        else{
            while(Temp.next.next!=null){
                Temp = Temp.next;

            }
            Temp.next= null;

            return t;
        }
    }

    public static void main(String[] args) {
        Node Temp = null;
        boolean a = true;

        while(a) {
            System.out.print("Enter the choice: \n1 for Insertion:\t\t2 for deletion:\n3 for display:\t\t4 for exiting:\n: ");
            java.util.Scanner sc = new java.util.Scanner(System.in);

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: Temp = insert(Temp);
                break;
                case 3: displayll(Temp);
                    break;
                case 2:Temp = pop(Temp);
                    break;
                case 4:a = false;
                break;

            }
        }
    }
}
