import java.util.Scanner;
public class TaskTwo {
    // its about concatenation in Java
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String first_name,last_name; // variable declaration
        System.out.println("Enter First Name: ");
        first_name = sc.next();
        System.out.println("Enter Last Name: ");
        last_name = sc.next();
        // First Method
        System.out.println(first_name + " " + last_name);
        // Second Method
        System.out.println(first_name.concat(last_name));
        StringBuilder name = new StringBuilder();
        name.append("Mubashar");
        name.append("Ghazi");
        System.out.println(name.toString());
    }
}
