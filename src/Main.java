public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double pay = service.calculate(1_000_000, 12, 9.99);
        System.out.printf("%.2f",pay);

        double pay2 = service.calculate(1_000_000, 24, 9.99);
        System.out.printf("\n%.2f",pay2);

        double pay3 = service.calculate(1_000_000, 36, 9.99);
        System.out.printf("\n%.2f",pay3);
    }
}