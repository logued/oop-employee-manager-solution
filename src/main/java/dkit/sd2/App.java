package dkit.sd2;

import java.util.ArrayList;

/**
 * Sample program to test the Employee & Manager class hierarchy
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Employee & Manager - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        Employee emp1 = new Employee("John Brady", 35, 123.45);
        Employee emp2 = new Employee("Mary Ryan", 20, 198.45);
        Employee emp3 = new Employee("Alice Reilly");


        Manager m1 = new Manager("Bob", 40, 123.5, 300);
        Manager m2 = new Manager("Martin", 35, 113.5, 200);

        System.out.println("m1 salary = " + m1.getSalary());


        //toString test
        System.out.println("\ntoString() Test:");
        System.out.println(emp1);
        System.out.println(m1);
        System.out.println("\n\n");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(m1);
        employees.add(m2);
        employees.add(new Employee("Franz Zimmer", 32, 223.45) );
        employees.add(new Manager("Harray ENfield", 20, 140.50, 500));

    //    Employee emp10 = null;
    //    employees.add(emp10);

//      TODO#1 Write code to output all details from the arrayList (using toString())
        System.out.println("\nDetails from arraylist:");
        for( Employee e : employees ) {
            System.out.println( e.toString() );
        }

//      TODO#2 Write code to display the salaries only.
        System.out.println("\nAll salaries:");

        for(Employee emp : employees) {
            System.out.println("Name:"+emp.getName() + "Salary: "+emp.getSalary());
        }

//TODO  Can you display the bonus amounts only?
        //Bonus amounts are attributes of a Manager class (but not an Employee)
        // So, we can only call a getBonus() method on objects that are Managers.
        // We use "instanceof" to find out if an object is of a particular type.
        // We must also cast the type of the reference from Employee to Manager, as
        // we cannot call getBonus( ) on an Employee type (it doesn't exist in Employee class)

        for(Employee emp : employees) {
            if( emp instanceof Manager) {
                Manager m = (Manager)emp;   // cast the reference to type "reference to Manager object"
                System.out.println("Name:" + m.getName() + "Bonus: " + m.getBonus());
            }
        }

//      TODO#3 Examine the following code

//        Employee e1 = m1;  // Is this OK - why or why not?
        // answer: yes, we can assign a reference to Manage to Employee
        // because a Manager is an Employee (Manager extends Employee)
        //
//
//        Manager m1  = e1;  // Is this OK - why or why not?
        // answer: NO, an Employee id NOT a Manager, a Manager has more than
        // an Employee, so if we allowed this, those extras would be chopped out!

//        Dynamic type & declared type of an Object reference
        // In the loops above, the emp variable may end up referring to a
        // Manager or an Employee object.  The type of the object is not known
        // until it is assigned to the "emp" reference.  This is called dynamic binding.
        // 'Dynamic' because it changes type.

//        TODO#4 Consider testing to see if two objects are equal

        // refer to equals( )methods - can auto generate


    }


}
