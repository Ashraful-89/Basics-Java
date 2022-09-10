import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        // find out the grastest number from three bumber
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three number whose check the greatest number :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a > b ) {
            if(a > c ) {
                System.out.println(+a + "  is Greatest number ");
            }
            else {
                System.out.println(+c + " is greatest number");
            }
        }
        else {
            if( b > c ) {
                System.out.println( + b  + " is greatest number");
            }
            else {
                System.out.println(+c +" is greatest number");
            }
        }
    }
}
