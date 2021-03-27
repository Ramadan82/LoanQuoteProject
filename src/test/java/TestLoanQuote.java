import helper.LoanAssessor;
import loancontroller.MonthlyRepaymentAmortized;
import loanmodel.LoanApplicant;
import loanmodel.LoanCompany;
import loanmodel.LoanDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repayment.MonthlyRepayment;

import java.time.LocalDate;

public class TestLoanQuote {

    @Test
    void testCalculateAge() {
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "UK");
        int ageOfApplicant = loanApplicant.calculateAge();
        Assertions.assertEquals(32, ageOfApplicant);
    }

    @Test
    void testHasEnoughAfterExpenditure() {
        LoanDetails loanDetails = new LoanDetails(10000, 100000, 60000, 36);
        boolean isQualified = loanDetails.hasEnoughAfterExpenditure();
        Assertions.assertTrue(isQualified);
    }

    @Test
    void testPaymentAmountPerMonth(){
        LoanDetails loan = new LoanDetails(20000, 30000, 10000, 60);
        LoanCompany loanCompany = new LoanCompany("Zopa", 7.5, 12, 70);
        MonthlyRepayment mntPay = new MonthlyRepaymentAmortized();
        Assertions.assertEquals(400.76, mntPay.monthlyRepaymentPlan(loan, loanCompany));
    }

    @Test
    void testIsEntitled(){
        LoanDetails loan = new LoanDetails(20000, 30000, 10000, 36);
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "UK");
        LoanCompany loanCompany = new LoanCompany("Zopa", 7.5, 12, 70);
        LoanAssessor assessor = new LoanAssessor();
        boolean isEntitled = assessor.isEntitled(loan, loanApplicant, loanCompany);
        Assertions.assertTrue(isEntitled);
    }

    @Test
    void testIsEntitledCitizenship(){
        LoanDetails loan = new LoanDetails(20000, 30000, 10000, 36);
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "Nigeria");
        LoanCompany loanCompany = new LoanCompany("Zopa", 7.5, 12, 70);
        LoanAssessor assessor = new LoanAssessor();
        boolean isEntitled = assessor.isEntitled(loan, loanApplicant, loanCompany);
        Assertions.assertFalse(isEntitled);
    }
}