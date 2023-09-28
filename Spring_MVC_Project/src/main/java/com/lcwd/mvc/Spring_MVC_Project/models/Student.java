package com.lcwd.mvc.Spring_MVC_Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student
{
    private String name;
    private int empID;
    private String phone;

    // consume : json include : setter : @JsonProperty
    // produce : json exclude : getter : @JsonIgnore

    // consume : json exclude : setter : @JsonIgnore
    // produce : json include : getter : @JsonProperty & Fields @JsonProperty

  //  @JsonIgnore
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
