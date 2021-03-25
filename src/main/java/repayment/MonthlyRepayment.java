package repayment;

import loanmodel.LoanCompany;
import loanmodel.LoanDetails;

public interface MonthlyRepayment {
    double monthlyRepaymentPlan(LoanDetails loanDetails, LoanCompany loanCompany);
}
