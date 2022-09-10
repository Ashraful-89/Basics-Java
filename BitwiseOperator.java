import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        int x = 5;

        System.out.println("Bitwise or operation ( a | b ) = " + (a | b)); // output true
        System.out.println("Bitwise and operation ( a & b ) = " + (a & b)); // false

        System.out.println("Bitwise xor operation ( a ^ b ) = " + (a ^ b)); //true

        System.out.println("Bitwise Complement oprtator  ( a | b ) = " + (~x)); // 5 2's complement
        System.out.println("Bitwise or operation ( a << 2 ) = " + (x << 2)); // 101 to 10100 replace that output is 20
    }
}
