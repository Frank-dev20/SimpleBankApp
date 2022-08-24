package oop;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String email;
    private String customerName;
    private int phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double depositAmount){
        if(depositAmount>  0){
            this.balance += depositAmount;
        }
        else{
            System.out.println("You can't deposit negative amount");
        }
        return depositAmount;
    }

    public double withdraw(double withdrawAmount){
        if(withdrawAmount < this.balance){
            this.balance -= withdrawAmount;
        }
        else{
            System.out.println("insufficient funds, you tried to withdraw " + withdrawAmount);
        }
        return withdrawAmount;
    }
}
