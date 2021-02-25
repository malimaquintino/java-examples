package app;

import entities.Account;
import entities.BusinessAccount;

public class Program {
    public static void main(String[] args){
        Account ba = new BusinessAccount(2130, "Matheus", 500.0, 1000.00);
        System.out.println(ba);

        Account ac = new Account(3001, "Ana", 1500.0);
        System.out.println(ac);

    }
}
