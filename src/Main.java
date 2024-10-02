public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double interestRate = 9.99;
        int loanAmount = 1000000;

//        пример 1
        int loanTermYears1 = 1;
        System.out.println(service.calculate(loanAmount, loanTermYears1, interestRate));

//        пример 2
        int loanTermYears2 = 2;
        System.out.println(service.calculate(loanAmount, loanTermYears2, interestRate));

//        пример 3
        int loanTermYears3 = 3;
        System.out.println(service.calculate(loanAmount, loanTermYears3, interestRate));
    }
}