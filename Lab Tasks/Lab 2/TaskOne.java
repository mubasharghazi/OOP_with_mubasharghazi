import java.util.Scanner;
public class TaskOne {
    // This program is about Calculator using methods in java.
    // its for upto two values
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int multi(int a,int b){
        return a*b ;
    }
    static int div(int a,int b){
            return a/b ;
    }
    public static void main(String[] args){
        int x,y,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        y = sc.nextInt();
        System.out.println("Select an operator (+,-,/,*): ");
        System.out.println("Enter Operator: ");
        char op;
        op = sc.next().charAt(0);
        switch (op){
            case '+':
                result = sum(x,y);
                System.out.println("The Sum of " + x + " and " + y + " is= " + result);
                break;
            case '-':
                result = sub(x,y);
                System.out.println("The Subtraction of " + x + " and " + y + " is= " + result);
                break;
            case '*':
                result = multi(x,y);
                System.out.println("The Product of " + x + " and " + y + " is= " + result);
                break;
            case '/':
                result = div(x,y);
                System.out.println("The Division of " + x + " and " + y + " is= " + result);
                break;
            default:
                System.out.println("Invalid Operator!");
        }

    }
}
