package loancontroller;
import java.lang.Math;
import repayment.MonthlyRepayment;

import loanmodel.*;
public class
MonthlyRepaymentAmortized implements MonthlyRepayment {

    @Override
    public double monthlyRepaymentPlan(LoanDetails loanDetails, LoanCompany loanCompany) {
        double loanAmount = loanDetails.getLoanAmountRequired();
        double interestRate = loanCompany.getInterestRate();
        double numberOfPayments = loanDetails.getTermRequired();
        double a = (1 + interestRate);

        double paymentAmountPerMonth = loanAmount * (interestRate * Math.pow(a, numberOfPayments) / Math.pow(a, numberOfPayments)-1);
        return paymentAmountPerMonth;
    }
}
