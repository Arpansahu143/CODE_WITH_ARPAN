// Question 5. Define a base class Person with instance variable name, age. The instance variables are initialized through constructors. The prototype of constructor is as below. 
//                                                           Person (string, int) 
// Define a derived class Employee with instance variables Eid, salary. The instance variables are initialized through constructors. The prototype of the constructor is as below. 
//                                                 Employee (string, int, int, double)
// Another instance method of Employee class is empDisplay() to display the information of employee details. 
// Solution:


class Person {
     String name;
     int age;

  
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
     int Eid;
     double salary;

   
    public Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    
    public void empDisplay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Q05 {
    public static void main(String[] args) {
      
        Employee emp = new Employee("John", 30, 101, 50000.0);

      
        emp.empDisplay();
    }
}
// OUTPUT
// Enter Employee Id: 
// 38
// Enter Name: 
// Arpan
// Enter Age: 
// 18
// Enter Salary: 
// 100000
// Employee ID: 38
// Name: Arpan
// Age: 20
// Salary: 10000.0
