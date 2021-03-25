import loancontroller.LoanAssessor;
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
    public void testCalculateAge() {
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "UK");
        int ageOfApplicant = loanApplicant.calculateAge(loanApplicant);
        Assertions.assertEquals(32, ageOfApplicant);
    }

    @Test
    public void testHasEnoughAfterExpenditure() {
        LoanDetails loanDetails = new LoanDetails(10000, 100000, 60000, 36);
        boolean isQualified = loanDetails.hasEnoughAfterExpenditure();
        Assertions.assertTrue(isQualified);
    }
    @Test
    public void testPaymentAmountPerMonth(){
        LoanDetails loan = new LoanDetails(20000, 30000, 10000, 60);
        LoanCompany company = new LoanCompany("Zopa", 7.5, 12, 70);
        MonthlyRepayment mntPay = new MonthlyRepaymentAmortized();
        Assertions.assertEquals(400.76, mntPay.monthlyRepaymentPlan(loan, company));
    }

    @Test
    public void testIsEntitled(){
        LoanDetails loan = new LoanDetails(20000, 30000, 10000, 36);
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "UK");
        LoanAssessor assessor = new LoanAssessor();
        boolean isEntitled = assessor.isEntitled(loan, loanApplicant);
        Assertions.assertTrue(isEntitled);
    }

    @Test
    public void testIsEntitledCitizenship(){
        LoanDetails loan = new LoanDetails(20000, 30000, 10000, 36);
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1988, 10, 05), "Nigeria");
        LoanAssessor assessor = new LoanAssessor();
        boolean isEntitled = assessor.isEntitled(loan, loanApplicant);
        Assertions.assertFalse(isEntitled);
    }

}