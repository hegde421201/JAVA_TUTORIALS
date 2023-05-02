package src.main.oops.classobjects;

public class CODemo8 {

    public static void main(String[] args) {

        System.out.println("***Demonstration.User-defined copy constructor example in Java\n");
        Employee employee = new Employee("Bundi",123056.8);

        System.out.println(" The Employee details is as follows:");
        employee.displayDetails();

        System.out.println("\n Copying employee1 to employee2 now");

        //Invoking the user-defined copy constructor
        Employee employee2 = new Employee (employee);
        System.out.println(" The details of Employee2 is as follows:");
        employee2.displayDetails();
    }
}

class Employee{

    String name;
    double salary;

    //Instance Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Copy Constructor
    public Employee(Employee employee){
        this.name = employee.name;
        this.salary = employee.salary;
    }

    public void displayDetails()
    {
        System.out.println(" Employee name: " + name + ",Salary: "+salary);
    }

}

/*
 Copying an Object

 Sometimes we will be interested in copying an object. In a real-world application, creating a new instance from scratch is a costly,time-consuming, and boring operation.
 Sometimes the overall process is also complicated.
 We can accomplish the task of copying in various ways. Serialization methods, object cloning, copy constructors, and so forth are used in this context.

* */