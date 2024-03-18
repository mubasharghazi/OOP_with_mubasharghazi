//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1 , num2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        Calculator obj = new Calculator();
        obj.sum(num1,num2);
        obj.diff(num1,num2);

    }
}