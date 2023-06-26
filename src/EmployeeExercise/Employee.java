package EmployeeExercise;

import java.util.Random;
import java.util.Scanner;

public class Employee {
    String id;
    String firstName;
    String secondName;
    int salaryPerMonth;

public Employee(String firstName, String secondName, int salaryPerMonth){
    this.firstName = firstName;
    this.secondName = secondName;
    this.salaryPerMonth = salaryPerMonth;
}


    public int getSalaryPerMonth(){
        return salaryPerMonth;
    }

    public String setID() {
        this.id = id;
        Random random = new Random();
        id = firstName + secondName + random.nextInt();
        return id;
    }

    public String getId() {
        System.out.println("Your ID is: " + id);
        return id;
    }


    public String getName() {
        this.firstName = firstName;
        this.secondName = secondName;
        String name = firstName + " " + secondName;
        //System.out.println("Your name is: " + name);
        return name;
    }

    public int updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the updated salary number");
        this.salaryPerMonth = scanner.nextInt();

        return salaryPerMonth;
    }

    public int raiseSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("With how many % would you like to raise the salary?");
        int percentageRaise = scanner.nextInt();
        int raisedSalary = salaryPerMonth + (salaryPerMonth * percentageRaise / 100);
        System.out.println("The new salary is: " + raisedSalary);
        return raisedSalary;
    }

    public int getAnnualSalary() {
        return salaryPerMonth * 12;
    }
    public String toString() {
        return "Employee ID: " + id + "\n"
                + "Name: " + getName() + "\n"
                + "Salary: " + salaryPerMonth + "\n"
                + "Annual salary: " + getAnnualSalary();
}
}
