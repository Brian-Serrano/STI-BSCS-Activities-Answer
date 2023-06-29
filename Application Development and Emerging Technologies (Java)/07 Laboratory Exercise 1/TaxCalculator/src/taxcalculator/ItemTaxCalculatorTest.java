package taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemTaxCalculatorTest {

	@Test
	void testCalculateItemTax() {
		System.out.println("CalculateItemTax method");
		ItemTaxCalculator instance = new ItemTaxCalculator ();
		double itemPrice = 50.0;
		double taxPercent = 1.0;
		double expectedResult = 5.0;
		double result = instance.CalculateItemTax(itemPrice, taxPercent);
		assertEquals(expectedResult, result, 0.0);
	}

}
