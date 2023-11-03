package Bank;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank bankOne = new Bank();
        bankOne.createAccount();
        bankOne.printAllAccounts();
        bankOne.start();




//        HashMap<String, Account> accounts = new HashMap<>();
//        final Random random = new Random();
//
//        String accNum;
//        double money;
//        for (int i = 0; i < 10; i++) {
//            int num = (int) Math.round(Math.random() * 100_000);
//            money = Math.random() * 10_000_000;
//            accNum = Integer.toString(num);
//            Account currentAcc = new Account(false, money, accNum);
//            accounts.put(accNum, currentAcc);
//        }
//        System.out.println(accounts.);
//
//
//        Object[] keys = accounts.keySet().toArray();
//        String fromAccountNum;
//        String toAccountNum;
//
//        do {
//            fromAccountNum = (String) keys[random.nextInt(keys.length)];
//            toAccountNum = (String) keys[random.nextInt(keys.length)];
//        } while (fromAccountNum.equals(toAccountNum));
//
//        Account account1 = accounts.get(fromAccountNum);
//        Account account2 = accounts.get(toAccountNum);
//
//        if (!account1.block && !account2.block) {
//            account1.money -= 5000;
//            account2.money += 5000;
//            System.out.println("Account " + account1.accNumber + " now has " + account1.money + " money");
//        } else {
//            System.out.println("One of the accounts is blocked. Operation can not be completed");
//        }
    }

}


