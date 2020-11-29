package dkit.sd2;
/* Manager is a subclass of Employee
   -> inherits all the instance variable and methods from its superclass (Employee)

 */
public class Manager extends Employee      // Employer is the superclass of Manager
{
    private double bonus;

    public Manager(String name, double hours, double rate, double bonus)
    {
        super(name, hours, rate);   // calls the constructor of the superclass
        this.bonus = bonus;
    }

    public Manager()
    {
        super();                // calls the constructor of the superclass
        this.bonus = 0;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }


    @Override
    public double getSalary()
    {
        return super.getSalary() + this.bonus;
    }

    // Default version of toString() as inserted by IntelliJ

    @Override
    public String toString()
    {
        return "Manager{" +
                //"name=" + getName() +
                super.toString() +
                "bonus=" + bonus +
                '}';
    }
}
