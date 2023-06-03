package org.example;

public class jobDescription {

    private String name;
    private String lastName;
    private int idNo;

    public jobDescription(String name, String lastName, int idNo) {
        this.name = name;
        this.lastName = lastName;
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    void nameBadge() {
        System.out.println("Name:" + getName());
        System.out.println("Last name: " + getLastName());
        System.out.println("ID no:" +getIdNo());
    }
}
