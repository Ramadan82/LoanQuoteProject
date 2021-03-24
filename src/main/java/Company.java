public class Company {
    private  String companyName;
    private double interestRate;
    private int minimumTerm;
    private int maximumTerm;

    public void company(String companyName, double interestRate, int minimumTerm, int maximumTerm){
        this.companyName = companyName;
        this.interestRate = interestRate;
        this.minimumTerm = minimumTerm;
        this.maximumTerm = maximumTerm;
    }

    public String getCompanyName() {
        return companyName;
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
