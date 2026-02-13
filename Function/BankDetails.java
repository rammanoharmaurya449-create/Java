import java.util.ArrayList;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance in account " + accountNumber);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: $" + balance);
    }
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void transfer(String fromAcc, String toAcc, double amount)
            throws InsufficientFundsException {

        Account sender = findAccount(fromAcc);
        Account receiver = findAccount(toAcc);

        if (sender != null && receiver != null) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transfer successful: $" + amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.displayAccount();
        }
    }
}

public class BankDetails {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account acc1 = new Account("A101", "Ram Manohar Maurya", 1000);
        Account acc2 = new Account("A102", "Anjana Maurya", 500);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        bank.displayAllAccounts();

        try {
            acc1.deposit(200);
            acc1.withdraw(300);
            bank.transfer("A101", "A102", 400);
            acc2.withdraw(2000);

        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nFinal Account Details:");
        bank.displayAllAccounts();
    }
}