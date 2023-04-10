
public class Main {
    public static void main(String[] args) {
        CreditPaymentsService service = new CreditPaymentsService();
        int annuityPayment = (int) service.calculate(9.99, 1_000_000, 1);
        System.out.println();
        System.out.println("Ежемесячный платеж при ставке 9.99% годовых, сумме кредита 1 000 000 рублей на 1 год:");
        System.out.println(annuityPayment + " рублей ");
        System.out.println();
        System.out.println("Ежемесячный платеж при ставке 9.99% годовых, сумме кредита 1 000 000 рублей на 2 года:");
        System.out.println((int) service.calculate(9.99, 1_000_000, 2) + " рублей ");
        System.out.println();
        System.out.println("Ежемесячный платеж при ставке 9.99% годовых, сумме кредита 1 000 000 рублей на 3 года:");
        System.out.println((int) service.calculate(9.99, 1_000_000, 3) + " рублей ");
    }
}
