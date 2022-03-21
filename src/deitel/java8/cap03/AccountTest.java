package deitel.java8.cap03;

import java.util.Scanner;

/**
 * 15/03/2022
 * @author andre
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String theName;
        double deposit;
        
        Account account1 = new Account("Jane Green", 10.0);
        Account account2 = new Account("John Blue", 0.0);
        
        
        System.out.println("Informe o nome:");
        theName = input.nextLine();
        System.out.println("Entre a quantia para depósito:");
        deposit = input.nextDouble();
        Account account3 = new Account(theName, deposit);
        System.out.println();
        
        account1.displayBalanceAccount();
        account2.displayBalanceAccount();
        account3.displayBalanceAccount();
        
        account1.displayGetBalanceDeposit();
        deposit = input.nextDouble();
        account1.deposit(deposit);
        
        account2.displayGetBalanceDeposit();
        deposit = input.nextDouble();
        account2.deposit(deposit);
        
        account3.displayGetBalanceDeposit();
        deposit = input.nextDouble();
        account3.deposit(deposit);
        
        account1.displayBalanceAccount();
        account2.displayBalanceAccount();
        account3.displayBalanceAccount();
    }
}
