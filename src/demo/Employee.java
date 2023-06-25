package demo;

import java.util.Random;
import java.util.Scanner;

public class Employee {
    String id;
    String firstName;
    String secondName;
    int salaryPerMonth;


public int setSalaryPerMonth(){
    this.salaryPerMonth = salaryPerMonth;
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the monthly salary");
    salaryPerMonth = scanner.nextInt();
    return salaryPerMonth;
}
    public String setID(){
        this.id=id;
        Random random = new Random();
        id = firstName+secondName+random.nextInt();
        return id;
    }
    public String getId(){
        System.out.println(id);
    return id;
    }
    public String setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        this.firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        this.secondName = scanner.nextLine();
         String name = firstName + secondName;
        return name;
    }
    public String getName(){
        this.firstName = firstName;
        this.secondName = secondName;
       String name = firstName + " "  + secondName;
        System.out.println(name);
        return name;
    }
    public int updateSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the updated salary number");
        this.salaryPerMonth = scanner.nextInt();

        return salaryPerMonth;
    }

    public int raiseSalary(){
        this.salaryPerMonth = salaryPerMonth;
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

    }


