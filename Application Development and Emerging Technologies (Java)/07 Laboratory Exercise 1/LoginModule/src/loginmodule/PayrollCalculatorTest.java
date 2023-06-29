package loginmodule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PayrollCalculatorTest {

	PayrollCalculator payrollCalculator = new PayrollCalculator();

	@Test
	void testGetTotalSalary1() {
		double result = payrollCalculator.getTotalSalary(50, 5, 100);
		assertEquals(7750.0, result);
	}
	@Test
	void testGetTotalSalary2() {
		double result = payrollCalculator.getTotalSalary(65.75, 5.5, 100.25);
		assertEquals(10248.78125, result);
	}
	@Test
	void testGetTotalSalary3() {
		double result = payrollCalculator.getTotalSalary(100, 10.5, 300.2);
		assertEquals(46080.0, result);
	}
	@Test
	void testGetRegularPay1() {
		payrollCalculator.getTotalSalary(200, 8, 2);
		double result = payrollCalculator.getRegularPay();
		assertEquals(1600.0, result);
	}
	@Test
	void testGetRegularPay2() {
		payrollCalculator.getTotalSalary(300.5, 9.25, 2000);
		double result = payrollCalculator.getRegularPay();
		assertEquals(2779.625, result);
	}
	@Test
	void testGetOverTimePay1() {
		payrollCalculator.getTotalSalary(200, 8, 2);
		double result = payrollCalculator.getOverTimePay();
		assertEquals(600.0, result);
	}
	@Test
	void testGetOverTimePay2() {
		payrollCalculator.getTotalSalary(300.5, 9.25, 2000);
		double result = payrollCalculator.getOverTimePay();
		assertEquals(901500.0, result);
	}

}
