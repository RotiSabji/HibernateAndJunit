package com.example.ORMx;


import javax.persistence.Embeddable;

//tells that it is not a entity but a embedded object
@Embeddable
public class AlienName {
    String firstName;
    String middleName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return "[fname="+firstName+" middleName="+middleName+" LastName="+lastName+"]";
    }

}
