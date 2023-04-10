public class CreditPaymentsService {
    public double calculate(double monthlyRatePercent, double amountCreditRouble, int creditTermYear) {
        double ratePercentInMonth = (monthlyRatePercent / 12 / 100);
        int creditTermMonth = (creditTermYear * 12);
        int annuityPayment = (int) (amountCreditRouble * (ratePercentInMonth + (ratePercentInMonth / (Math.pow((1 + ratePercentInMonth), creditTermMonth) - 1))));
        return annuityPayment;
    }
}
