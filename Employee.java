package com.today;

public class Employee {
    long EmployeeID;
    String EmployeeName;
    int EmployeeSalary;
    String Department;

    public Employee() {
    }



    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeID(long employeeID) {
        EmployeeID = employeeID;
    }

    public long getEmployeeID() {
        return EmployeeID;

    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeSalary=" + EmployeeSalary +
                ", Department='" + Department + '\'' +
                '}';
    }
}
