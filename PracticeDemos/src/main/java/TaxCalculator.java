public interface TaxCalculator {
    // In an interface there are no state or data
    // Only method declarations
    // Every method by default is public - so you dont need to include the public access modifier
    double calculateTax();
}
