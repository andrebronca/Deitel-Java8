package deitel.java8.cap02;

import java.util.Scanner;

/**
 * 14/03/2022
 * @author andre
 */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int res;
        
        System.out.print("Informe o primeiro número inteiro: ");
        number1 = input.nextInt();
        
        System.out.print("Informe o segundo número inteiro: ");
        number2 = input.nextInt();
        
        res = number1 + number2;
        
        System.out.printf("Soma é %d%n", res);
    }
}
