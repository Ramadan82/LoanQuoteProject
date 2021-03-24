import loancontroller.LoanAssesor;
import loanmodel.LoanApplicant;
import loanmodel.LoanDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
}
