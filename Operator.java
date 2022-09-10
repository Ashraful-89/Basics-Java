import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Arithmetic operator
        // Take 2 innteger from keyboard
        System.out.println("Enter the First Number :");
        int n1 = input.nextInt();

        System.out.println("Enter the Second Number :");
        int n2 = input.nextInt();

        System.out.println("Addition of this two number : " + (n1 + n2));
        System.out.println("Substraction of this two number : " + (n1 - n2));
        System.out.println("Multiplication of this two number : " + (n1 * n2));
        System.out.println("DIvision of this two number : " + (n1 / n2));
        System.out.println("Reminter  of this two number : " + (n1 % n2));

        // Assignment Operatior
        // This Two number same operation using assignment operator
        System.out.println("Addition of this two number : " + ( n1 = n2)); // n1 == n2
        System.out.println("Substraction of this two number : " + (n1 += n2)); // n1 = n1 + n2
        System.out.println("Multiplication of this two number : " + (n1 -= n2)); // n1 = n1 - n2
        System.out.println("DIvision of this two number : " + (n1 *= n2)); // n1 = n1 + n2
        System.out.println("Reminter  of this two number : " + (n1 /= n2)); // n1 = n1 / n2
        System.out.println("Addition of this two number : " + (n1 %=  n2)); // n1 = n1 % n2



        // create variables
        int a = 7, b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true



        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        // declare variables
        a = 12 ; b= 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);



    }
}
