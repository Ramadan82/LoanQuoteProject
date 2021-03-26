package loanmodel;

public class LoanDetails {
    private  final double loanAmountRequired;
    private final double totalAnnualIncome;
    private final double annualExpenditure;
    private final int termRequired;


    public LoanDetails(double loanAmountRequired, double totalAnnualIncome, double annualExpenditure, int termRequired ){
        this.loanAmountRequired = loanAmountRequired;
        this.totalAnnualIncome = totalAnnualIncome;
        this.annualExpenditure = annualExpenditure;
        this.termRequired = termRequired;
    }

    public double getLoanAmountRequired() {
        return loanAmountRequired;
    }

    public double getTotalAnnualIncome() {
        return totalAnnualIncome;
    }

    public double getAnnualExpenditure() {
        return annualExpenditure;
    }

    public int getTermRequired() {
        return termRequired;
    }

    public boolean hasEnoughAfterExpenditure(){
        double totalAnnualIncome = this.getTotalAnnualIncome();
        double annualExpenditure = this.getAnnualExpenditure();
        double requiredAfterExpenditure = totalAnnualIncome * 0.25;
        double balance = totalAnnualIncome - annualExpenditure;
        return balance >= requiredAfterExpenditure;
    }

    @Override
    public String toString(){
        return "Loan amount requested  : £"+getLoanAmountRequired()+"\n" +
                "Your total income is: £"+getTotalAnnualIncome()+"\n"+
                "Your annual expenses is : £"+getAnnualExpenditure()+"\n"+
                "and you want to pay in : "+getTermRequired()+" months";
    }
}
