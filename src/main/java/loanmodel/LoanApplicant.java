package loanmodel;

import java.time.LocalDate;
import java.time.Period;

public class LoanApplicant {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String citizenship;

    public LoanApplicant(String firstName, String lastName, LocalDate dateOfBirth, String citizenship){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int calculateAge(){
        LocalDate dob = this.getDateOfBirth();
        LocalDate currentDate = LocalDate.now();
        Period difference = Period.between(dob, currentDate);
        return difference.getYears();
    }

    public String getCitizenship() {
        return citizenship;
    }
}
