public class CreditPaymentService {
    public double calculate (double credit_amount, double credit_term, double interest_rate ) {
        double monthly_percentage = interest_rate /12/100 ;
        double coefficient = monthly_percentage * Math.pow(1+monthly_percentage,credit_term)/(Math.pow(1 + monthly_percentage,credit_term) - 1 );
        double pay = credit_amount * coefficient;

        return pay;
    }
}
