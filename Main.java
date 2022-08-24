package oop;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // create bank account
        bankAccount.setAccountNumber("345098724");
        bankAccount.setCustomerName("Frank Joseph");
        bankAccount.setEmail("france@y.com");
        bankAccount.setPhoneNumber(+23409878);
        // check the initial balance
        System.out.println("Your initial balance is " + bankAccount.getBalance());
        System.out.println("You deposited " + bankAccount.deposit(50000));
        System.out.println("Your account balance is " + bankAccount.getBalance());

        System.out.println(bankAccount.withdraw(500000));
        System.out.println("You withdrew "+ bankAccount.withdraw(5000));
        System.out.println("Your balance is " + bankAccount.getBalance());

    }
}