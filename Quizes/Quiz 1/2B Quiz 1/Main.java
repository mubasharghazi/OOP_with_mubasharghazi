import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = sc.nextInt();
        EvenOdd obj = new EvenOdd();
        obj.evenOdd(num);
    }
}