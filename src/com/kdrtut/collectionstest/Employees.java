package com.kdrtut.collectionstest;

public class Employees {
    private Integer empid;
    private String empname;
    private String empsal;
    private String empemail;

    public Employees(Integer empid, String empname, String empsal, String empemail) {
        this.empid = empid;
        this.empname = empname;
        this.empsal = empsal;
        this.empemail = empemail;
    }

    @Override
    public String toString() {
        return "Employee [employeeid= " + empid + ", employeename= " + empname + ", employeesalary= "
                + empsal + ", employeeemail= " + empemail + "]";
    }

}
