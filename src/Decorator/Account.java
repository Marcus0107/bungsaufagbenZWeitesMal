package Decorator;

import java.util.List;

/**
 * Created by Marcus on 09.05.2017.
 */
public interface Account
{
    void addTransaction(Transaction transaction) throws TransactionDeclinedException;
    double calculateSaldo();
    List<Transaction> getTransactions();
}
