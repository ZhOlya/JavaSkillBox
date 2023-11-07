package Bank;

import java.util.HashMap;
import java.util.Random;

public class TransferTask implements Runnable {
    private Bank bank;
    private final Random random = new Random();
    private String fromAcc = "";
    private String toAcc = "";
    long amount;

    public TransferTask(Bank bank) {
        this.bank = bank;
    }


//    public TransferTask(Bank bank, String fromAcc, String toAcc, long amount) {
//        this.bank = bank;
//        this.fromAcc = fromAcc;
//        this.toAcc = toAcc;
//        this.amount = amount;
//    }

    @Override
    public void run() {
        System.out.println("Start run");
        fromAcc = bank.getRandomKeys(fromAcc);
        toAcc = bank.getRandomKeys(toAcc);
        amount = 80_000;

        try {
            bank.transfer(fromAcc, toAcc, amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
