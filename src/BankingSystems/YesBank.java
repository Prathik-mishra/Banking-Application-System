package BankingSystems;

public class YesBank implements Bank{
    private String name;
    private String bankAccountNo;
    private double balance;
    private String password;
    public static final double rateOfInterest = 6.5;

    public YesBank(String name, String password,double balance) {
        //Random generator function
        //Generate a 10-digit account No and initialize the account number
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String addMoney(String password, int money) {
        balance += money;
        return "The amount has been credited, the new balance is "+this.balance;
    }

    @Override
    public String checkBalance(String password) {
        if(password.equals(this.password)){
            return "The balance is "+this.balance;
        }else{
            return "The password is Incorrect !";
        }
    }

    @Override
    public String withdrawMoney(String password, int money) {
        if(password.equals(this.password)){
            if(balance >= money){
                balance -= money;
                return "The money has been withdraw, new balance is "+this.balance;
            }else{
                return "Insufficient balance !";
            }
        }else{
            return "The password entered is incorrect";
        }
    }

    @Override
    public double getRateOfInterest(int years) {
        double totalInterest = (balance*YesBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}
