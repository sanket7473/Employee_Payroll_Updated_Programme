package com.bridgelabz_employee_programme;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee payroll programme");
        int Is_Full_time=1;
        int Emp_Hrs=0,Emp_Wage=0;
        int Emp_Rate_Per_hour=20;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println("Employee Attendance check " + empCheck);
        if (empCheck == Is_Full_time) {
            System.out.println("Employee is present");
            Emp_Hrs=8;
        } else {
            System.out.println("Employee is Absent");
            Emp_Hrs=0;
        }
        Emp_Wage=Emp_Hrs*Emp_Rate_Per_hour;
        System.out.println("Employee wage is "+Emp_Wage);
    }
}