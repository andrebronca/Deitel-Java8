package deitel.java8.cap03;

/**
 * 15/03/2022
 * @author andre
 */
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        
        if (balance > 0.0){
            this.balance = balance;
        }
    }
    
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void displayBalanceAccount(){
        System.out.printf("%s balance: R$%.2f %n", getName(), getBalance());
    }
    
    public void displayGetBalanceDeposit(){
        System.out.println("Informe a quantia a depositar para: "+ getName() );
    }
    
    public void displayGetNome(){
        System.out.println("Informe o nome:");
    }
    
    public void displayGetDeposit(){
        System.out.println("Entre a quantia para depósito:");
    }
    
    
}
