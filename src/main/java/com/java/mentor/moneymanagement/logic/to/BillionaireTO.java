package com.java.mentor.moneymanagement.logic.to;

import java.util.Objects;

public class BillionaireTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String career;


    public Long getId() {
        return id;
    }

    public BillionaireTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public BillionaireTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BillionaireTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCareer() {
        return career;
    }

    public BillionaireTO setCareer(String career) {
        this.career = career;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BillionaireTO)) return false;
        BillionaireTO that = (BillionaireTO) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(career, that.career);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, career);
    }
}
