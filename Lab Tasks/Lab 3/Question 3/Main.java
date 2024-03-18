import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter Elements of the Array: ");
        // Input Digits in an Array
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Maximum Number is: " + Maximum.maxi(arr));
        System.out.println("The Minimum Number is: " + Minimum.mini(arr));

    }
}