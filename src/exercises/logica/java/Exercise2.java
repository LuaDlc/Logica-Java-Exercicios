package exercises.logica.java;

import java.util.Scanner;
/*
make an algorithm that receives two numbers, and at the end shows
the addition, subtraction, division and multiplication of the two
numbers read
 */
public class Exercise2 {
    public static void main(String[] args) {
        int number1=0;
        int number2=0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1= leitor.nextInt();
        System.out.println("Enter the second number: ");
        number2= leitor.nextInt();

        int sum= number1 + number2;
        int subtraction= number1 - number2;
        int division= number1 / number2;
        int multiplication= number1 * number2;

        System.out.println("sum:" +sum);
        System.out.println("subtraction:" +subtraction);
        System.out.println("division:" + division);
        System.out.println("multiplication:" + multiplication);
    }

}
