package BankingSystems;

public class HDFCBank implements Bank{
    //we are trying to use properties of encapsulation here
    public int accountNo;
    public String accountName;

    private String secretCode;

    private double balance;
    public double minBalance;

    public static final double rateOfInterest = 8.5;

    public HDFCBank(int accountNo, String accountName, String secretCode, double balance) {
        // accNo generate a random and store it
        this.accountName = accountName;
        this.secretCode = secretCode;
        this.balance = balance;
        minBalance = 5000.0;
    }

    @Override
    public String addMoney(String password, int money) {
        return null;
    }

    @Override
    public String checkBalance(String password) {
        if(password.equals(this.secretCode)){
            return "The balance is "+balance;
        }
        return "The password entered is wrong !";
    }

    @Override
    public String withdrawMoney(String password, int money) {
        if(password.equals(this.secretCode)){
            if(balance >= (money+minBalance)){
                return "Money withdraw successfull ! Final balance is "+this.balance;
            }else{
                return "Sufficient balance not available";
            }
        }else{
            return "password entered is wrong";
        }
    }

    @Override
    public double getRateOfInterest(int years) {
        double totalInterest = (balance*HDFCBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}
