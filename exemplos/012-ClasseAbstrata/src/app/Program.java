package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/*
* Classe Abstrata
* Não podem ser instanciadas
* garantem herança total, somente subclasses não abstrata podem ser instanciadas
* */
public class Program {
    public static void main(String[] args){
        // Account acc1 = new Account(1010, "Anna", 1000.00); //não pode ser instanciada
        Account acc2 = new BusinessAccount(213, "Joseph", 2000.0, 100.00);
        Account acc3 = new SavingsAccount(423, "Maria", 3000.0, 00.1);
    }
}
