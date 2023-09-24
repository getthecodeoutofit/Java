import java.beans.JavaBean;

public class LL {
    public static class Node {
        int data;
        Node next;

        Node(int item) {
            data = item;
        }
    }



    static Node Binsert(Node T){
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
    static void display(Node t){
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

    static Node Finsert(Node T){
        int data;
        System.out.print("Enter the item to insert: ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        data = s.nextInt();
        s.nextLine();
        Node newnode = new Node(data);
        newnode.next = null;
        if(T == null){
            T = newnode;
        }
        else{
            newnode.next=T;
            T = newnode;
        }
    return T;
    }
    static Node Pinsert(Node T){
        Node temp = T;
        System.out.print("Enter the position: ");
        int pos,item;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        pos = sc.nextInt();
        System.out.print("Enter the Item: ");
        item = sc.nextInt();
        Node newnode = new Node(item);
        if(T == null){
            T = newnode;
            T.next = null;
        }
        else{
            for(int i=0;(i<pos-1)&&(temp.next!=null);i++){
                temp = temp.next;
            }

        }


        return T;
    }

    public static void main(String[] args) {
        Node Temp = null;
        boolean a = true;
        System.out.print("Enter the choice: \n1 for Insertion:\t\t2 for deletion:\n3 for display:\t\t4 for exiting:\n: ");

        while(a) {
            java.util.Scanner sc = new java.util.Scanner(System.in);

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: Temp = Binsert(Temp);
                break;
                case 2:Temp = Finsert(Temp);
                    break;
                case 3:Temp = Pinsert(Temp);
                    break;
                case 4:Temp = pop(Temp);
                    break;
                case 5:
                    break;
                case 6:
                     break;
                case 7: display(Temp);
                    break;

                case 8:a = false;
                break;

            }
        }
    }
}
