import helper.LoanAssessor;
import helper.LoanSelector;
import loancontroller.MonthlyRepaymentAmortized;
import loanmodel.*;
import repayment.MonthlyRepayment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanTester {
    public static void main(String[] args) {
        LoanDetails loanDetails = new LoanDetails(20000, 30000, 10000, 36);
        LoanApplicant loanApplicant = new LoanApplicant("Harry", "William", LocalDate.of(1995, 10, 05), "UK");
        LoanCompany loanCompany1 = new LoanCompany("Zopa", 7.5, 12, 70);
        LoanCompany loanCompany2 = new LoanCompany("Monzo", 8.8, 1, 56);
        LoanCompany loanCompany3 = new LoanCompany("Barclays", 6.2, 12, 32);
        MonthlyRepayment monthlyRepayment = new MonthlyRepaymentAmortized();

        List<LoanCompany> companies = new ArrayList<>();
        companies.add(loanCompany1);
        companies.add(loanCompany2);
        companies.add(loanCompany3);

        LoanCompany loanCompany = LoanSelector.selectBestLoan(companies, loanDetails, loanApplicant);

        System.out.println("=======================Loan Details==================================");
        String loanCompanyName = loanCompany.getLoanCompanyNam();
        String loanApplicantFirstNameName = loanApplicant.getFirstName();
        String loanApplicantLastName = loanApplicant.getLastName();
        System.out.println(loanApplicantFirstNameName + " " + loanApplicantLastName);

        System.out.println("You are applying for a loan from " + loanCompanyName);
        System.out.println(loanDetails);

        System.out.println("\n");

        if(loanCompany != null){
            System.out.println("You are qualified for the loan");
            System.out.println("======================Payment Details==============================");
            double monthlyPayment = monthlyRepayment.monthlyRepaymentPlan(loanDetails, loanCompany);
            System.out.println("You will pay a total of : £"+(monthlyPayment * loanDetails.getTermRequired()));
            System.out.println("Your monthly payment is: £"+monthlyPayment);
        }else{
            System.out.println("====================================================================");
            System.out.println("Sorry you are not qualified. we cannot offer you the loan this time around");
        }
    }
}
