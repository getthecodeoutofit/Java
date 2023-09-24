public class Classes {

    public static class h{
        int data;
        int number;

    }

    static void change(h h1){

        System.out.print("Enter the data: ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        h1.data = s.nextInt();
        System.out.println("Enter the number: ");
        h1.number = s.nextInt();


    }

    public static void main(String []  args){
h hello = new h();
change(hello);
System.out.println("the data: "+hello.data+" The number: "+hello.number);

    }
}

// Default access specifier can be used in same package(folder)
// public can be accessed from any package and private is accessed in same class or file

;

