import java.util.Scanner;
class Loop {
    public static void main(String[] args) {
        System.out.println("Enter your Name: ");
        Scanner input = new Scanner(System.in);
        String name;
        name = input.nextLine();

        for(int i=0; i<100; i++){
            System.out.println("Your Name is: " + name);
        }
    }
}