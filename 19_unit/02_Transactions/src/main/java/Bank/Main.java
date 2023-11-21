package Bank;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Bank bankOne = new Bank();

        bankOne.createAccount(false, 1_000_000, "111");
        bankOne.createAccount(false, 1_000_000, "222");
        bankOne.createAccount(false, 1_000_000, "333");
        bankOne.createAccount(false, 1_000_000, "444");
        bankOne.createAccount(false, 1_000_000, "555");
        bankOne.createAccount(false, 1_000_000, "666");
        bankOne.createAccount(false, 1_000_000, "777");
        bankOne.createAccount(false, 1_000_000, "888");
        bankOne.createAccount(false, 1_000_000, "999");
        bankOne.createAccount(false, 1_000_000, "122");


        bankOne.printAllAccounts();
        bankOne.getTotalBalanceOfBank();


//        Thread threadOne = new Thread(new TransferTask(bankOne,"122","999", 70_000));
//        Thread threadTwo = new Thread(new TransferTask(bankOne, "777", "666",50_000));
//        threadOne.start();
//        threadTwo.start();

        Thread threadThree = new Thread(new TransferTask(bankOne));
        Thread threadFour = new Thread(new TransferTask(bankOne));
        threadFour.start();
        threadThree.start();

        try{
            threadFour.join();
            threadThree.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("CRAZY");

            System.out.println("");
            bankOne.printAllAccounts();


        System.out.println("CRAZY");


//        bankOne.start();




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


