package Decorator;

/**
 * Created by Marcus on 09.05.2017.
 */
public class Transaction
{
    final String description;
    final double value;

    public Transaction(String description, double value){
        this.description = description;
        this.value = value;
    }

    public String getDescription()
    {
        return description;
    }

    public double getValue()
    {
        return value;
    }
}
