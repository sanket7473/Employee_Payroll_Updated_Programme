package com.bridgelabz_employee_programme;

public class EmployeeWage {
   public static final int Is_Full_time=1;
    public static final int Is_Part_Time=2;
    public static final int Emp_Rate_Per_hour=20;
    public static final int Num_Working_Days=20;
    public static void main(String[] args) {
        System.out.println("Welcome to the employee payroll programme");
        int Emp_Hrs = 0, Emp_Wage = 0,totalEmployeeWage=0;
        for (int day = 1; day < Num_Working_Days; day++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            System.out.println("Employee Attendance check " + empCheck);
            switch ((int) empCheck) {
                case Is_Full_time:
                    System.out.println("Employee is present");
                    Emp_Hrs = 8;
                    break;
                case Is_Part_Time:
                    System.out.println("Employee is present");
                    Emp_Hrs = 4;
                    break;
                default:
                    Emp_Hrs = 0;
            }
            Emp_Wage = Emp_Hrs * Emp_Rate_Per_hour;
            System.out.println("Employee wage is " + Emp_Wage);
            totalEmployeeWage=totalEmployeeWage+Emp_Wage;
        }
        System.out.println("Total Employee wage"+totalEmployeeWage);
    }

    }
