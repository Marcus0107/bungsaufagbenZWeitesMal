package Decorator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 09.05.2017.
 */
public class DefaultAccount implements Account
{
    final String customer;
    List<Transaction> transactions;



    public DefaultAccount(String customer)
    {
        this.customer = customer;
        this.transactions = new LinkedList<>();
    }

    @Override
    public void addTransaction(Transaction transaction)
    {
        transactions.add(transaction);
    }

    public double calculateSaldo()
    {
        double saldo = 0;
        for (Transaction transaction : transactions)
        {
            saldo += transaction.getValue();
        }
        return  saldo;
    }

    @Override
    public List<Transaction> getTransactions()
    {
        return transactions;
    }

    public String getCustomer()
    {
        return customer;
    }
}
