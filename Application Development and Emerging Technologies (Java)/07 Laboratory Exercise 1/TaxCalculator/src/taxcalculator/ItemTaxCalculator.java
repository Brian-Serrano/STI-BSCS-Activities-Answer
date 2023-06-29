package taxcalculator;

public class ItemTaxCalculator {
	public double CalculateItemTax (double itemPrice, double taxPercent) {
		double decrease = taxPercent / 10.0;
		return itemPrice * decrease;
	}
}