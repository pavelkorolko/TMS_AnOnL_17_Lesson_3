public class Bank {
    private final int taxRate;
    private final double initialDeposit;
    private final int months;

    public Bank(double deposit, int tax, int months) {
        this.initialDeposit = deposit;
        this.taxRate = tax;
        this.months = months;
    }

    public double calculateEndDeposit(){
        double result = 0;
        for (int i = 1; i <= months; i++) {
            result += initialDeposit  + initialDeposit * taxRate / 100;
        }
        return result;
    }
}
