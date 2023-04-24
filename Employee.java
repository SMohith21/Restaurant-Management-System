
public class Employee extends Staff
{
    private static final double MINIMUM_RATE = 13.5; 
    
    public Employee()
    {
        super();
    }   
    public Employee( int newID, String newLastName, String newFirstName, String newPassward , int newWage)
    {
        super(newID, newLastName, newFirstName, newPassward , newWage);
        wageRate = MINIMUM_RATE;
    }
    
    public void setWageRate(double newRate)
    {
        if( newRate < MINIMUM_RATE)
            wageRate = MINIMUM_RATE;
        else
            wageRate = newRate;
    }
    
    public double culculateWages()
    {
        return wageRate * culculateWorkTime();
    }

}
