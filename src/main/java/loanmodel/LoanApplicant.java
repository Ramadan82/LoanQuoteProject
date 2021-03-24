package loanmodel;

import java.util.*;

public class LoanApplicant {
    private final String firstName;
    private final String lastName;
    private final Date dateOfBirth;
    private final String Citizenship;


    public LoanApplicant(String firstName, String lastName, Date dateOfBirth, String citizenship){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.Citizenship = citizenship;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCitizenship() {
        return Citizenship;
    }



}
