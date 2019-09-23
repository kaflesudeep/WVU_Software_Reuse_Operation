package CalculatorAndConverterTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import CommonMethods.Converter;
import CommonMethods.Operation;

public class CalculationTestSample {
	@Test
	// getting the result in the first data format
	public void testAddition() {

		Operation op = new Operation();
		assertEquals("101", op.performAddition(11, Converter.BINARY, 2.0, Converter.DOUBLE));
		assertEquals("4", op.performAddition(2, Converter.INTEGER, 2.0, Converter.DOUBLE));
		assertEquals("4.2", op.performAddition(2, Converter.DOUBLE, 2.2, Converter.DOUBLE));
		assertEquals("25", op.performAddition(2, Converter.INTEGER, 27, Converter.OCTAL));
		assertEquals("56", op.performAddition(10, Converter.INTEGER, "2e", Converter.HEXADECIMAL));

	}

	@Test
	// getting the result in binary when adding binary with other number
	public void testSubtraction() {

		Operation op = new Operation();
		assertEquals("1", op.performSubtraction(11, Converter.BINARY, 2.0, Converter.DOUBLE));
		assertEquals("0", op.performSubtraction(2, Converter.INTEGER, 2.0, Converter.DOUBLE));
		assertEquals("-0.2", op.performSubtraction(2, Converter.DOUBLE, 2.2, Converter.DOUBLE));
		assertEquals("-21", op.performSubtraction(2, Converter.INTEGER, 27, Converter.OCTAL));
		assertEquals("-36", op.performSubtraction(10, Converter.INTEGER, "2e", Converter.HEXADECIMAL));

	}

	@Test
	// getting the result in binary when adding binary with other number
	public void testMultiply() {

		Operation op = new Operation();

		assertEquals("0", op.performMultiplication(11, Converter.BINARY, 0, Converter.DOUBLE));
		assertEquals("0", op.performMultiplication(2, Converter.INTEGER, 0, Converter.DOUBLE));
		assertEquals("0", op.performMultiplication(2, Converter.DOUBLE, 0, Converter.DOUBLE));
		assertEquals("0", op.performMultiplication(2, Converter.INTEGER, 0, Converter.OCTAL));
		assertEquals("0", op.performMultiplication(10, Converter.INTEGER, "0", Converter.HEXADECIMAL));

		assertEquals("110", op.performMultiplication(11, Converter.BINARY, 2, Converter.DOUBLE));
		assertEquals("10010", op.performMultiplication(11, Converter.BINARY, 110, Converter.BINARY));
		assertEquals("14.4", op.performMultiplication(2, Converter.DOUBLE, 7.2, Converter.DOUBLE));
		assertEquals("230", op.performMultiplication(10, Converter.INTEGER, 27, Converter.OCTAL));
		assertEquals("1700", op.performMultiplication(10, Converter.INTEGER, "aa", Converter.HEXADECIMAL));
		assertEquals("202", op.performMultiplication(15, Converter.OCTAL, "a", Converter.HEXADECIMAL));
		assertEquals("6a4", op.performMultiplication("a", Converter.HEXADECIMAL, "aa", Converter.HEXADECIMAL));

	}

	@Test
	// getting the result in binary when adding binary with other number
	public void testDivide() {

		Operation op = new Operation();

		assertEquals("Infinity", op.performDivision(11, Converter.BINARY, 0, Converter.INTEGER));
		assertEquals("Infinity", op.performDivision(2, Converter.INTEGER, 0, Converter.INTEGER));
		assertEquals("Infinity", op.performDivision(2, Converter.DOUBLE, 0, Converter.INTEGER));
		assertEquals("Infinity", op.performDivision(2, Converter.INTEGER, 0, Converter.OCTAL));
		assertEquals("Infinity", op.performDivision(10, Converter.INTEGER, "0", Converter.HEXADECIMAL));

		assertEquals("1", op.performDivision(11, Converter.BINARY, 3, Converter.INTEGER));
		assertEquals("9", op.performDivision(27, Converter.INTEGER, 3, Converter.INTEGER));
		assertEquals("1.0", op.performDivision(2, Converter.DOUBLE, 2, Converter.INTEGER));
		assertEquals("3", op.performDivision(12, Converter.INTEGER, 4, Converter.OCTAL));
		assertEquals("10", op.performDivision(100, Converter.INTEGER, "a", Converter.HEXADECIMAL));

	}

	@Test
	// getting the result in binary when adding binary with other number
	public void testSqrRoot() {

		Operation op = new Operation();
		//
		assertEquals("11", op.performSquareRoot(1001, Converter.BINARY));
		assertEquals("0", op.performSquareRoot(0, Converter.INTEGER));
		assertEquals("2", op.performSquareRoot(4, Converter.DOUBLE));
		assertEquals("4", op.performSquareRoot(16, Converter.INTEGER));
		assertEquals("a", op.performSquareRoot(64, Converter.HEXADECIMAL));

	}

}
