package com.bridgelabz_employee_programme;

public class EmployeeWage {
    public static final int Is_Full_time=1;
    public static final int Is_Part_Time=2;
    public static final int Emp_Rate_Per_hour=20;
    public static final int Num_Working_Days=20;
    public static final int MAX_HRS_INA_MONTH=100;
    public static int computeEmpWage()
    {
        System.out.println("Welcome to the employee payroll programme");
        int Emp_Hrs = 0, Emp_Wage = 0,totalEmpHrs=0,totalWorkingDays=0;
        while(totalEmpHrs<MAX_HRS_INA_MONTH || totalWorkingDays< Num_Working_Days)
        {
            totalWorkingDays++;
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
            totalEmpHrs=totalEmpHrs+Emp_Hrs;
            System.out.println("Day"+totalWorkingDays+ "Employee hours"+Emp_Hrs );

        }
       int totalEmployeeWage=totalEmpHrs*Emp_Rate_Per_hour;
        System.out.println("Total Employee wage "+totalEmployeeWage);
        return  totalEmployeeWage;
    }
    public static void main(String[] args) {
        computeEmpWage();
}
}
