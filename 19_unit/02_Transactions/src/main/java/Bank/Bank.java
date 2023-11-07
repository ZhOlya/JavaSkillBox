package Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank   {
    private static
    HashMap<String, Account> accounts;
    private  final Random random = new Random();
    private Bank bank;

    public Bank() {
        accounts = new HashMap<>();
    }

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


    public synchronized void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        //exist?
        if (isAccExist(fromAccountNum) && isAccExist(toAccountNum)) {
            Account account1 = accounts.get(fromAccountNum);
            Account account2 = accounts.get(toAccountNum);

            if (!account1.block && !account2.block) {
                account1.money -= amount;
                account2.money += amount;
                System.out.println("Account " + account1.accNumber + " now has " + account1.money + " money");
                System.out.println("Account " + account2.accNumber + " now has " + account2.money + " money");
                if (amount > 50_000) {
                    System.out.println("Security check...");
                    if (isFraud(fromAccountNum, toAccountNum, amount)) {
                        blockAccounts(fromAccountNum, toAccountNum);
                    } else {
                        System.out.println("Operation is completed");
                    }
                }
            } else {
                System.out.println("One of the accounts is blocked. Operation can not be completed");
            }
            getTotalBalanceOfBank();
        } else {
            System.out.println("One or both of these accounts is blocked");
        }
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {
        Account account = accounts.get(accountNum);
        return account.money;
    }

    public void getTotalBalanceOfBank (){
        long sum = 0;
        for (Map.Entry<String, Account> entery : accounts.entrySet()) {
            String key =entery.getKey();
            Account account = accounts.get(key);
            sum += account.money;
        }
        System.out.println(" Total balance of bank: " + sum);
    }

    public void blockAccounts (String fromAccountNum, String toAccountNum){
        Account account1 = accounts.get(fromAccountNum);
        Account account2 = accounts.get(toAccountNum);
        System.out.println("Both accounts is blocked!");
        account1.block = true;
        account2.block = true;
        System.out.println(accounts.get(fromAccountNum) + "\n" + accounts.get(toAccountNum));
    }

    public void createAccount(boolean block, long money, String accNumber){
        //проверка на содержание
        accounts.put(accNumber, new Account(block, money, accNumber));

    }


//    public void createAccountRandom() {
//        String accNum;
//        long money;
//        for (int i = 0; i < 10; i++) {
//            int num = (int) Math.round(Math.random() * 100_000);
//            money = (long) (Math.random() * 10_000_000);
//            accNum = Integer.toString(num);
//            Account currentAcc = new Account(false,money,accNum);
//            accounts.put(accNum, currentAcc);
//        }
//    }

    public void printAllAccounts(){
        for (Map.Entry entry: accounts.entrySet()) {
            System.out.println(entry);
        }

    }

    private void activateAccount(String accountNum){
    }

    public  String getRandomKeys(String randomAcc){
        Object [] keys = Bank.accounts.keySet().toArray();
        randomAcc = (String)keys[random.nextInt(keys.length)];
//        System.out.println(randomAcc);
        return randomAcc;

    }

    public boolean isAccExist (String number){
        accounts.containsKey(number);
        return true;
    }



}
