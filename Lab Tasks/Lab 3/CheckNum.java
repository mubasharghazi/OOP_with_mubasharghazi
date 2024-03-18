import java.util.Scanner;
public class CheckNum {
    static String checking(int a){
        boolean IsPresent = false;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arr.length; i++){
            if(a==arr[i]){
                IsPresent = true;
                break;
            }
        }
        if(IsPresent == true){
            return "Number Found!";
        }else{
            return "Number Not Found!";
        }
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number which you wants to Check:");
        num = sc.nextInt();
        System.out.println(checking(num));

    }
}
