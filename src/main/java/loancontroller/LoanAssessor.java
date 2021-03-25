package loancontroller;
import java.time.*;
import java.text.*;
import java.util.Date;

import loanmodel.*;
public class LoanAssessor {


    public boolean isEntitled(LoanDetails loanDetails, LoanApplicant loanApplicant){
        int age = loanApplicant.calculateAge(loanApplicant);
        String citizenship = loanApplicant.getCitizenship();
        int termRequired = loanDetails.getTermRequired();
        double totalAnnualIncome = loanDetails.getTotalAnnualIncome();
        return age > 18 && citizenship.equals("UK") && totalAnnualIncome > 10000 &&
                loanDetails.hasEnoughAfterExpenditure() && termRequired > 12 && termRequired <= 36;
    }




}
