import java.text.*;
import java.util.*;

class LoanApplicant {
    public void setLoanApplicantDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Firstname: ");
        String firstName = input.nextLine();
        System.out.println("Please enter your Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Please enter your Date of Birth in the format \"dd-mm-yy\": ");
        String dateOfBirth1 = input.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        try {
           Date dateOfBirth = sdf.parse(dateOfBirth1);
        }catch (ParseException e) {
            System.out.println("Parse Exception");
        }
        System.out.println("Please enter your citizenship by typing  \"citizen\" for a citizen or \"non citizen\" for a non citizen: ");
        String citizenship = input.nextLine();
        System.out.println("please enter your total annual income: ");
        double totalAnnualIncome = input.nextDouble();
        System.out.println("please enter the amount you want to request for the loan: ");
        double loanAmountRequested = input.nextDouble();
        System.out.println("please enter the duration of the loan in years");
        int loanTerm = input.nextInt();

    }
}
