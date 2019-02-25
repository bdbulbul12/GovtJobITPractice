
package pubalibank2018;


public class Bank {
    double totalBalance=1000;
    public double totalAmount(String tName,String tType,double amount){
        if(tType.equals("debit")){
            return totalBalance-amount;
        }else{
            return totalBalance+amount;
        }
    }
}
