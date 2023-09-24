public class staticss {
// class can access the variable or function if its static (static create a foxed memory location)
    // but we can access te both non static and static by creating the class
    //static variable can be used as shared memory
    //for example
public class comp{
    static int data;
    int area;
    }
    public static void main(String[] args) {
    System.out.println(comp.data);
    // data will not get printed when it is non-static
        //means it will not be shared with class of that variable if not static



    }
}
