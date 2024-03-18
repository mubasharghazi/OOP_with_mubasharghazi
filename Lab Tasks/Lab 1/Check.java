import java.util.Scanner;
class Check {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number: ");
        Scanner a = new Scanner(System.in);
        num = a.nextInt();

        if(num % 2 == 0){
            // If number is even
            System.out.println("It Multiply with 10 and answer is = " + (num * 10));
        }else{
            System.out.println(num + " square is = " + (num*num));
        }
    }
}