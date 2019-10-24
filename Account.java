package two.Project1;

public class Account {  // this will be the "engine" of the game

    private double balance;

    public Account(){
        balance = 100;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double money){
        balance -= money;
    }

    public void deposit(double money){
        balance += money;
    }
}
