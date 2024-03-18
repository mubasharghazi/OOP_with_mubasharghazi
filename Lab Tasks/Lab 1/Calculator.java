import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {

        System.out.println("Simple Calculator in Java");

        int num1,num2;
        System.out.println("Enter two Values: ");
        // Scanner For Input
        Scanner o = new Scanner(System.in);
        num1 = o.nextInt();
        num2 = o.nextInt();
        System.out.print("Enter an operator: ");
        char op;
        op = o.next().charAt(0);
        switch (op){
            case '+':
                System.out.println("The Sum is = " + (num1+num2));
                break;
            case '-':
                System.out.println("The Result is = " + (num1-num2));
                break;
            case '*':
                System.out.println("The Product is = " + (num1*num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("The result is = " + (num1/num2));
                }else{
                    System.out.println("Error: Maths error");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }
}