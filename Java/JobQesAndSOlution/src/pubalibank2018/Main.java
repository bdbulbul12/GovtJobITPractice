
package pubalibank2018;

public class Main{
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        double amount =  bank.totalAmount("name","credit",500);
        System.out.println("Total Balance = "+amount);
    }
}
