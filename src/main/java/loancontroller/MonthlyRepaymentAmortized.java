package loancontroller;
import java.lang.Math;
import java.text.DecimalFormat;

import loanmodel.*;
import repayment.MonthlyRepayment;

public class
MonthlyRepaymentAmortized implements MonthlyRepayment {

    @Override
    public double monthlyRepaymentPlan(LoanDetails loanDetails, LoanCompany loanCompany) {
        //Amortization Calculation Reference: https://www.vertex42.com/ExcelArticles/amortization-calculation.html
        double loanAmount = loanDetails.getLoanAmountRequired();
        double interestRate = loanCompany.getInterestRate();
       
        double numberOfPayments = loanDetails.getTermRequired();
        double r = (interestRate/100) / 12;
        double a = (1 + r);

        double paymentAmountPerMonth = loanAmount *  (r * (Math.pow(a, numberOfPayments))) / (Math.pow(a, numberOfPayments)-1);
        return Math.round(paymentAmountPerMonth * 100.0) / 100.0;
    }
}
