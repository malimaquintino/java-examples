package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args){
        Account ac = new Account(3001, "Ana", 1500.0);
        System.out.println(ac);

        // UPCASTING BusinessAccount é uma Account
        Account ba = new BusinessAccount(2130, "Matheus", 500.0, 1000.00);
        System.out.println(ba);

        // DOWNCASTING - ba é uma BusinessAccount declarada como Account logo é necessario fazer um casting para atribuir a outra var BusinessAccount
        BusinessAccount bacc = (BusinessAccount) ba;
        bacc.loan(100.00);
        // ba.loan(); ba não pode fazer o loan pq é uma account

        if (ba instanceof BusinessAccount){
            System.out.println("ba is instanceof BusinessAccount");
        }

        if (ba instanceof SavingsAccount){
            System.out.println("ba is instanceof SavingsAccount");
        }

        if (ba instanceof Account){
            System.out.println("ba is instanceof Account");
        }

        // teste sobreposicao do metodo
        Account acc2 = new Account(2170, "Malcon", 1000.0);
        acc2.withdraw(500.00);
        System.out.println("Balance "+acc2.getBalance());

        BusinessAccount bacc2 = new BusinessAccount(2170, "Marlon", 500.0, 1000.00);
        bacc2.withdraw(300.00);
        System.out.println("Balance "+bacc2.getBalance());

        SavingsAccount sacc = new SavingsAccount(213, "Maria", 200.00, 1.05);
        sacc.withdraw(100.00);
        System.out.println("Balance "+sacc.getBalance());

    }
}
