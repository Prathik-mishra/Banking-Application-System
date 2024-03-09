package BankingSystems;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        System.out.println("Enter the initial balance you want to add ");
        int initialBalance = sc.nextInt();

        Bank bankAcc = new YesBank(name,password,initialBalance);

        System.out.println("your bank account is created");
        System.out.println("Enter the money you want to add ");

        int money = sc.nextInt();

        String result = bankAcc.addMoney(password,money);
        System.out.println(result);

        System.out.println("Enter the money you want to withdraw");

        money = sc.nextInt();
        password = sc.next();
        result = bankAcc.withdrawMoney(password,money);
        System.out.println(result);

        System.out.println("Lets see your balance now !!");
        password = sc.next();
        result = bankAcc.checkBalance(password);
        System.out.println(result);

        System.out.println("Enter the time you want to save the money");
        int years = sc.nextInt();
        double roi = bankAcc.getRateOfInterest(years);
        System.out.println("This is you answer "+roi);
    }
}
