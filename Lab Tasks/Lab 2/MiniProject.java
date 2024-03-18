import java.util.Scanner;
public class MiniProject {
    static void welcome(){
        // this is for welcome screen
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~    ---{Welcome to Our}--         ~");
        System.out.println("~   <<< Hotel Managment System >>> ~");
        System.out.println("~                                  ~");
        System.out.println("~              Developed by        ~");
        System.out.println("~                                  ~");
        System.out.println("~                        Mubashar  ~");
        System.out.println("~                            Ghazi ~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    static double taxCal(int a){
        return a * (0.17); // calculate 17% gst
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char choice; // for user choice (Do you want to order more items?) y/n
        int total = 0; // for the sum of orders price as total
        int customer_choice; // What do you want to order? from list of items

        welcome();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        do {
            // Taking order from user
            System.out.println("~~~~Menu~~~");
            System.out.println("1.Ice cream  200/-");
            System.out.println("2.Pasta   500/-");
            System.out.println("3.Tea  100/-");
            System.out.println("4.Samosa 100/-");
            System.out.println("What do you want to order?");
            customer_choice = sc.nextInt();

            // making total of items price
            if(customer_choice == 1){
                total = total + 200;
            } else if (customer_choice == 2) {
                total = total + 500;
            }else if (customer_choice == 3){
                total = total + 100;
            } else if (customer_choice == 4) {
                total = total + 100;
            }else{
                System.out.println("Invalid Order! ");
            }

            System.out.println("Do you want to order more items? ");
            System.out.println("Press (y/n) ");
            choice = sc.next().charAt(0);

//            if(choice == 'y'){
//                continue;
//            }else{
//                break;
//            }

        }while (choice != 'n');

        double bill = total + taxCal(total); // adding 17% gst to the total bill
        System.out.println("Your Bill Is: " + bill);
        System.out.println("please pay the bill and enjoy!");
    }
}
