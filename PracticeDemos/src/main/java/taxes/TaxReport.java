package taxes;

public class TaxReport {
    private TaxCalculator calculator; // Creating a field using the Interface taxes.TaxCalculator

    public TaxReport(TaxCalculator calculator){
        // Injecting the interface using the constructor method
        this.calculator = calculator;
    }

    // Method dependency injection
    public void show(TaxCalculator calculator){
        System.out.println(calculator.calculateTax());
    }

    // Dependency injection using setter
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
