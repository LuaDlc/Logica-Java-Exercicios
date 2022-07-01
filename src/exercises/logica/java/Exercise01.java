package exercises.logica.java;

import java.util.Scanner;
/*
Make an algorthm that tajes two numbers and receives the result of their sum
 */
public class Exercise01 {
    public static void main(String[] args) {
        int num1= 0;
        int num2 = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma entre os numeros e:" + soma);
    }


}
