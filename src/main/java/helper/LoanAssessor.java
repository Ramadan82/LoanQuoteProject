package helper;

import loanmodel.*;

public class LoanAssessor {
    /**
     * This method checks for entitlement of the loan applicant with the following assumptions:
     * 1. Application is at least 18 years old.
     * 2. The applicant is a British citizen.
     * 3. The applicant's income is more than £10K annually.
     * 4. The applicant has enough balance after expenditure.
     * 5. The loan term is within the range of min and max term of the company.
     * @param loanDetails details of the loan
     * @param loanApplicant details of the applicant
     * @param loanCompany details of the company
     * @return either entitled or not
     */
    public boolean isEntitled(LoanDetails loanDetails, LoanApplicant loanApplicant, LoanCompany loanCompany){
        int age = loanApplicant.calculateAge();
        String citizenship = loanApplicant.getCitizenship();
        int termRequired = loanDetails.getTermRequired();
        double totalAnnualIncome = loanDetails.getTotalAnnualIncome();
        return age > 18 &&
                citizenship.equals("UK") &&
                totalAnnualIncome > 10000 &&
                loanDetails.hasEnoughAfterExpenditure() &&
                termRequired > loanCompany.getMinimumTerm() &&
                termRequired <= loanCompany.getMaximumTerm();
    }
}
