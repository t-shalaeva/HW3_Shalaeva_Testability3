public class CreditPaymentService {
    public static int calculate(int loanAmount, int loanTermYears, double interestRate) {
        int loanTermMonths = loanTermYears * 12;
        double monthlyRate = interestRate / (100 * 12);
        double monthlyPayment = loanAmount * monthlyRate / (1 - Math.pow((1 + monthlyRate), -loanTermMonths));
        return (int) monthlyPayment;
    }
}
