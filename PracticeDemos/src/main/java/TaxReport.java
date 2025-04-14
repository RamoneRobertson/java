public class TaxReport {
    private TaxCalculator calculator; // Creating a field using the Interface TaxCalculator

    public TaxReport(TaxCalculator calculator){
        // Injecting the interface using the constructor method
        this.calculator = calculator;
    }


    public void show(){
        System.out.println(calculator.calculateTax());
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
