package Decorator;

import org.junit.*;

import java.util.DoubleSummaryStatistics;

import static org.junit.Assert.*;

/**
 * Created by Marcus on 09.05.2017.
 */
public class NoNegativAccountTest
{
    @Test
    public void test() throws TransactionDeclinedException
    {
        Account bankAccount = new NoNegativAccount(new DefaultAccount("Marcus"), "Marcus");

        assertEquals(0, bankAccount.calculateSaldo(), 0.0000001);
        bankAccount.addTransaction(new Transaction("First euro", 1.00));
        assertEquals(1.00, bankAccount.calculateSaldo(), 0.000001);

        try
        {
            bankAccount.addTransaction(new Transaction("Throw test", -5.00));
            fail("Where is the exception");
        } catch (TransactionDeclinedException ignore)
        {
        }

        bankAccount.addTransaction(new Transaction("Lunch mone", -0.40));
        assertEquals(0.60, bankAccount.calculateSaldo(), 0.0001);
    }


}