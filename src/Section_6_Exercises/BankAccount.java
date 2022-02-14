package Section_6_Exercises;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        // "this" calles another constructor
        this("1234", 2.50, "Default name", "Default email", "123456");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName,
                       String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("78945612", 100.55, customerName, customerEmail, customerPhone);
    }

    public String getAccountNumber() {
        return number;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public double getAccountBalance() {
        return this.balance;
    }

    public void setAccountBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount +
                    " made. New balance is " + this.balance);
        } else {
            System.out.println("Invalid value");
        }
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= this.balance) {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount +
                    " processed. Remaining balance = " + this.balance);
            System.out.println("Total account balance is: " + this.balance);
        } else {
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        }
    }
}



