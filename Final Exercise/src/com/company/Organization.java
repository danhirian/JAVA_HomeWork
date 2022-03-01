package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Organization {

    public void org() {
        //creating the map
        Map<Integer, Employees> database = new HashMap<Integer, Employees>();

        //creating the employees
        Employees emp1 = new Employees("Jack", 45, 'M', "IT", "SysAdmin", 25000);
        Employees emp2 = new Employees("Daniel", 34, 'M', "HR", "Recruiter", 12000);
        Employees emp3 = new Employees("Jessica", 23, 'F', "Accounting", "Accountant", 9000);
        Employees emp4 = new Employees("Gary", 67, 'M', "Shipping", "Packager", 8000);
        Employees emp5 = new Employees("James", 55, 'M', "IT", "HelpDesk", 15000);

        //adding the employees into the hashmap
        database.put(1, emp1);
        database.put(2, emp2);
        database.put(3, emp3);
        database.put(4, emp4);
        database.put(5, emp5);

        //removing an employee
        database.remove(2);

        //adding an employee
        database.put(6, new Employees("Peter", 67, 'M', "Maintenance", "Janitor", 5000));

        //updating employee information
        database.put(1, new Employees("REPLACED", 45, 'M', "IT", "SysAdmin", 25000));

        //searching employee by attribute !!!NOT WORKING
        for (Employees i : database.values()) {
            if (database.values().contains("Peter")) {
                System.out.println("Employee found");
            } else {
                System.out.println("Not found");
            }
        }
        //traversing and printing the map
        for (Map.Entry<Integer, Employees> entry : database.entrySet()) {
            int key = entry.getKey();
            Employees b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.name + " " + b.age + " " + b.gender + " " + b.department + " " + b.title + " " + b.salary);
        }
    }
}








