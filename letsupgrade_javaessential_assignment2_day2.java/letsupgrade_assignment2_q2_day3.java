package com.employeedetails;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       //Take employee name,date of birth,month of birth
        //birth year, monthly salary;
        //5l - 20%;
        //4l - 15%;
        //3l- 10%;
        //2l -5%;
        //Display name,age,annual salary and the tax amount
         Scanner sc=new Scanner(System.in);
        String name;
        int birthDate;
        int birthMonth;
        int birthYear;
        float monthlySalary;
        int currentYear;
        float theTaxAmount;

        System.out.println("Employee Name");
        name=sc.next();
        System.out.println("Employee Birth Date");
        birthDate=sc.nextInt();
        System.out.println("Employee Birth Month");
        birthMonth=sc.nextInt();
        System.out.println("Employee Birth Year");
        birthYear=sc.nextInt();
        System.out.println("current year");
        currentYear=sc.nextInt();
        System.out.println("Employee monthly salary");
        monthlySalary=sc.nextInt();

        float annualSalary = 12*monthlySalary;
        System.out.println("Employee name:"+name);
        System.out.println("Employee date of birth:"+birthDate+"/"+birthMonth+"/"+birthYear);
        int age= currentYear - birthYear;
        System.out.println("Employee age:"+age);
        System.out.println("Employee annualSalary:"+annualSalary);

        if(annualSalary>=500000){
                theTaxAmount=(20*annualSalary)/100;
            System.out.println("20% tax");
            System.out.println("Tax amount is="+theTaxAmount);
        }
        else if(annualSalary<500000 && annualSalary>=400000){
            theTaxAmount=(15*annualSalary)/100;
            System.out.println("15% tax");
            System.out.println("Tax amount is="+theTaxAmount);
        }
        else if(annualSalary<400000 && annualSalary>=300000) {
            theTaxAmount = (10 * annualSalary)/100;
            System.out.println("10% tax");
            System.out.println("Tax amount is="+theTaxAmount);
        }
        else if(annualSalary<300000 && annualSalary>=200000) {
            theTaxAmount = (5 * annualSalary)/100;
            System.out.println("5% tax");
            System.out.println("Tax amount is="+theTaxAmount);
        }
        else {
            System.out.println("0% tax");
                System.out.println("Tax amount is nil");
            }
        }
    }
