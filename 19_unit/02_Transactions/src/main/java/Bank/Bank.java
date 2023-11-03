package Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank extends Thread{
    private HashMap<String, Account> accounts = new HashMap<>();
    private final Random random = new Random();
    Account account1;
    Account account2;


    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами.
     * Если сумма транзакции > 50000, то после совершения транзакции,
     * она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка
     * счетов (как – на ваше усмотрение)
     */

    public void makeRandomAccounts(long amount) throws InterruptedException {
        String fromAccountNum;
        String toAccountNum;
        Object [] keys = accounts.keySet().toArray();
        do{
            fromAccountNum = (String)keys[random.nextInt(keys.length)];
            toAccountNum =  (String)keys[random.nextInt(keys.length)];
        }while (fromAccountNum.equals(toAccountNum));

        transfer(fromAccountNum,toAccountNum,amount);
    }


    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        account1 = accounts.get(fromAccountNum);
        account2 = accounts.get(toAccountNum);

        if (!account1.block && !account2.block){
            account1.money -= amount;
            account2.money += amount;
            System.out.println("Account " + account1.accNumber + " now has " + account1.money + " money");
            System.out.println("Account " + account2.accNumber + " now has " + account2.money + " money");
        } else {
            System.out.println("One of the accounts is blocked. Operation can not be completed");
        }
        if (amount > 50_000){
            System.out.println("Security check...");
            if(isFraud(fromAccountNum, toAccountNum, amount)) {
                blockAccount(fromAccountNum, toAccountNum);
            } else {
                System.out.println("Operation is completed");
            }
        }
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public double getBalance(String accountNum) {
        Account account = accounts.get(accountNum);
        return account.money;
    }

    public void blockAccount (String fromAccountNum, String toAccountNum){
        account1.block = true;
        account2.block = true;
        System.out.println("Both accounts is blocked!");
        System.out.println(accounts.get(fromAccountNum) + "\n" + accounts.get(toAccountNum));
    }


    public void createAccount() {
        String accNum;
        long money;
        for (int i = 0; i < 10; i++) {
            int num = (int) Math.round(Math.random() * 100_000);
            money = (long) (Math.random() * 10_000_000);
            accNum = Integer.toString(num);
            Account currentAcc = new Account(false,money,accNum);
            accounts.put(accNum, currentAcc);
        }
    }

    public void printAllAccounts(){
        for (Map.Entry entry: accounts.entrySet()) {
            System.out.println(entry);
        }

    }

    private void activateAccount(String accountNum){
    }

    @Override
    public void run() {
        String fromAccountNum;
        String toAccountNum;
        long amount = 60_000;
        Object [] keys = accounts.keySet().toArray();
        do{
            fromAccountNum = (String)keys[random.nextInt(keys.length)];
            toAccountNum =  (String)keys[random.nextInt(keys.length)];
        }while (fromAccountNum.equals(toAccountNum));

        try {
            transfer(fromAccountNum,toAccountNum,amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
