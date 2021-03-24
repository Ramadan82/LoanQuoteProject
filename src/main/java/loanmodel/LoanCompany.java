package loanmodel;

public class LoanCompany{
    private final String loanCompanyName;
    private final double interestRate;
    private final int minimumTerm;
    private final int maximumTerm;

    public LoanCompany(String loanCompanyName, double interestRate, int minimumTerm, int maximumTerm){
        this.loanCompanyName = loanCompanyName;
        this.interestRate = interestRate;
        this.minimumTerm = minimumTerm;
        this.maximumTerm = maximumTerm;
    }

    public String getLoanCompanyNam() {
        return loanCompanyName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getMinimumTerm() {
        return minimumTerm;
    }

    public int getMaximumTerm() {
        return maximumTerm;
    }
}
