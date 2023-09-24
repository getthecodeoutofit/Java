import java.util.*;
public class calc {
    static int MAX = 100;
    static char [] stack= new char[MAX];
    static char [] post = new char[50];
    static StringBuilder infix=new StringBuilder(" ");
    static int p=0;
    static int top = 0;
    //we will create a postxi converteer

    public static int precedence(char a) {
        if (a == '+' || a == '-') {
            return 1;
        } else if (a == '*' || a == '/') {
            return 2;
        } else if (a == '%') {
            return 3;
        } else if (a == '(' || a == ')') {
            return 0;
        } else if((a >= 'a'&&a<='z')||(a>='A'&&a<='Z')){
            return 4;
        }
        else if(a == '^'){
            return 6;

        }
        return 5;
    }

    public static void insertstack(char temp) {
        post[p]= temp;
        p++;
        return;
}
    public static int pop(char c){
        if(top ==0){
            return -1;
        }
        insertstack(c);
        return --top;
    }
    public static void main(String[] args) {
        stack[0]='(';

        System.out.print("Enter the infix Expression: ");
        Scanner sc = new Scanner(System.in);
        infix.append(sc.nextLine());
        infix.append(')');
        int i,prec;
        for(i=0;i<infix.length();i++){
            prec = precedence(infix.charAt(i));
            switch (prec){
                case 1:
                    while((top!=0)&&(prec < precedence(stack[top]))){
                                top = pop(stack[top]);
                    }
                        ++top;
                        stack[top]=infix.charAt(i);
                    break;
                case 2:
                    if(prec>precedence(stack[top])){
                        stack[++top]=infix.charAt(i);
                    }
                    else{
                        while(prec<precedence(stack[top])||top!=0){
                           top = pop(stack[top]);
                        }
                        stack[++top]=infix.charAt(i);
                    }
                    break;
                case 3:
                    break;
                case 0:
                    if(infix.charAt(i) == '('){
                        top++;
                    stack[top]= infix.charAt(i);

                    }
                    else if(infix.charAt(i)==')'){
                        while((top>=0)&&(stack[top]!='(')){
                            top = pop(stack[top]);
                        }
                        System.out.print("Done: ");
                        --top;
                    }

                    break;
                case 4: post[p++]=infix.charAt(i);
                break;
                case 6:stack[++top]= infix.charAt(i);
                    break;

            }

        }

        for(i=0;i<p;i++){
            System.out.print(post[i]+" ");
        }

    }
}
