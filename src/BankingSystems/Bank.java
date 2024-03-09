package BankingSystems;
// interfaces contains definitions of methods
// interfaces are used to attain 100% abstractions
// by using it java can also implement multiple inheritance
public interface Bank {
    public String addMoney(String password, int money);

    public String checkBalance(String password);

    public String withdrawMoney(String password,int money);

    public double getRateOfInterest(int years);
}
