import loancontroller.LoanAssesor;
import loancontroller.MonthlyRepaymentAmortized;
import loanmodel.LoanApplicant;
import loanmodel.LoanCompany;
import loanmodel.LoanDetails;
import loancontroller.MonthlyRepaymentAmortized;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repayment.MonthlyRepayment;

import java.time.LocalDate;

public class LoanQuoteTester {

    @Test
    public void testCalculateAge(){
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "UK" );
        int ageOfApplicant = loanApplicant.calculateAge(loanApplicant);
        Assertions.assertEquals(32, ageOfApplicant);
    }

    @Test
    public void testHasEnoughAfterExpenditure(){
        LoanDetails loanDetails = new LoanDetails(10000, 100000, 60000, 36);
        boolean isQualified = loanDetails.hasEnoughAfterExpenditure();
        Assertions.assertTrue(isQualified);
    }
    @Test
    public void testPaymentAmountPerMonth(){
        LoanDetails loanDetails = new LoanDetails(20000,30000,10000, 60);
        LoanCompany loanCompany = new LoanCompany("Zopa",0.006,12,36);
        MonthlyRepayment monthlyRepayment = new MonthlyRepayment;
