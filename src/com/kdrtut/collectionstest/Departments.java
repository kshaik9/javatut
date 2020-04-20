package com.kdrtut.collectionstest;

public class Departments {
    private Integer deptid;
    private String deptname;
    private String deptlocation;

    public Departments(Integer deptid, String deptname, String deptlocation) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.deptlocation = deptlocation;
    }

    @Override
    public String toString() {
        return "Departments [departmentid= " + deptid + ", departmentname= " + deptname +
                ", departmentlocation= " + deptlocation + "]";
    }
}
