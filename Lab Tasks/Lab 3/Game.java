import java.util.Scanner;
public class Game {
    static String GetName(int a){
        switch (a){
            case 0:
                return "Rock";
            case 1:
                return "Scissors";

            case 2:
                return "Paper";
            default:
                return "Invalid Option";
        }
    }

    public static void main(String[] args){
        // for Input from
        Scanner sc = new Scanner(System.in);
        int UserChoice;
        while (true) {
        System.out.println("Simple Rock Scissors Paper Game!");
        // For Next line
        System.out.println("\n\n");

        System.out.println("0 for Rock, 1 for Scissors, 2 for Paper");
        System.out.println("Enter Your Choice: ");
        // Get User Choice
        UserChoice = sc.nextInt();
        int choice = (int)(Math.random() * 3);
        System.out.println("Your Choice: " + GetName(UserChoice));
        System.out.println("Computer Choice: " + GetName(choice));
        System.out.println("\n");

        // Conditional Programming
            if (UserChoice == choice) {
                System.out.println("You are Tie! \n");
                System.out.println("Try again!.........");

                // According to game
            } else if((UserChoice == 0 && choice == 1) || (UserChoice == 1 && choice == 2) || (UserChoice == 2 && choice == 0)) {
                System.out.println("You Win!");
            }else {
                System.out.println("You Lose!");
            }
            // Asking User to play again the game
            System.out.println("Did You want play again ?");
            System.out.println("yes/no");
            String exit;
            // getting user choice here
            exit = sc.next();
            if(exit == "no" || exit == "N" || exit == "n"){
                break;
            }else {
                continue;
            }
        }

    }

}
