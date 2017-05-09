package Decorator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 09.05.2017.
 */
public class NoNegativAccount implements Account
{
    final String customer;
    final Account account;

    public NoNegativAccount(Account account, String customer)
    {
        this.customer = customer;
        this.account = account;
    }

    @Override
    public void addTransaction(Transaction transaction) throws TransactionDeclinedException
    {
        double saldo = account.calculateSaldo();
        if ((saldo + transaction.getValue()) <= 0.00)
        {
            throw new TransactionDeclinedException();
        }
        else
        {
            account.addTransaction(transaction);
        }
    }

    @Override
    public double calculateSaldo()
    {
        double saldo = 0;
        for (Transaction transaction : account.getTransactions())
        {
            saldo += transaction.getValue();
        }
        return saldo;
    }

    public Account getAccount()
    {
        return account;
    }

    public String getCustomer()
    {
        return customer;
    }

    @Override
    public List<Transaction> getTransactions()
    {
        return account.getTransactions();
    }
}
