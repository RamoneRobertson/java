public class Main {
    public static void main(String[] args) {
        // Now in the main method we can create a new concrete calculator
        TaxCalculator calculator = new TaxCalculator2024(100_000);

        // TaxReport knows nothing about the calculator. The interface handles setting up the appropriate implementation of the tax calculator
        TaxReport report = new TaxReport(calculator);
        report.show();
    }
}
