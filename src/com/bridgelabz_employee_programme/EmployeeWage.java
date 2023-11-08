package com.bridgelabz_employee_programme;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee payroll programme");

        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println("Employee Attendance check " + empCheck);
        if (empCheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}