package helper;

import loanmodel.LoanApplicant;
import loanmodel.LoanCompany;
import loanmodel.LoanDetails;

import java.util.List;

public class LoanSelector {

    public static LoanCompany selectBestLoan(List<LoanCompany> loanCompanies, LoanDetails loanDetails, LoanApplicant loanApplicant) {
        LoanAssessor loanAssessor = new LoanAssessor();
        double minInterestRate = 100.0;
        // 1. Using for each approach
        LoanCompany bestLoanCompany = null;
        for (LoanCompany loanCompany : loanCompanies) {
            boolean isEntitled = loanAssessor.isEntitled(loanDetails, loanApplicant, loanCompany);
            if (isEntitled) {
                if (loanCompany.getInterestRate() < minInterestRate) {
                    minInterestRate = loanCompany.getInterestRate();
                    bestLoanCompany = loanCompany;
                }
            }
        }
        return bestLoanCompany;

        // Approach 2 using index
//        int minIndex = 0;
//        for (int i = 0; i < loanCompanies.size(); i++) {
//            double r = loanCompanies.get(i).getInterestRate();
//            if (r < minInterestRate) {
//                minInterestRate = r;
//                minIndex = i;
//            }
//        }
//        return loanCompanies.get(minIndex);
    }

}
