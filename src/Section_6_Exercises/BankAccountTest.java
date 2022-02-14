package Section_6_Exercises;

import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("ABC456789DE",
                100.00, "Bob Brown",
                "myemail@bob.com",
                "(087) 123-456");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmail());
        System.out.println(bobsAccount.getCustomerPhone());
        bobsAccount.withdrawal(100);
        System.out.println(bobsAccount.getAccountBalance());


        System.out.println();

//        BankAccount timsAccount = new BankAccount("Tim", "tim@example.com", "777");
//        System.out.println(timsAccount.getAccountNumber());
//        System.out.println(timsAccount.getAccountBalance());
//        System.out.println(timsAccount.getCustomerName());
//        System.out.println(timsAccount.getCustomerEmail());
//        System.out.println(timsAccount.getCustomerPhone());

    }
}
