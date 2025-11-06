//Практика: реализовать класс BankAccount с приватным балансом и методами deposit() и withdraw()


class BankAccount{
    private int balance;

    BankAccount(int balance){
        this.balance = balance;
    }

    void deposit(int num){
        if (num > 0) {
            balance += num;
        } else {
            System.out.println("error");
        }
    }

    void withdraw(int num){
        if (num > 0 && num <= balance) {
            balance -= num;
        } else {
            System.out.println("error");
        }
    }

    int getBallance(){
        return balance;
    }
}

public class Maint7 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);
        ba.deposit(500);
        ba.withdraw(100);
        System.out.println(ba.getBallance());
    }
}
