package CalculatorAndConverterTest;

import static org.junit.Assert.*;

import org.junit.Test;

import CommonMethods.Converter;
import CommonMethods.Operation;

public class converterTestSample {
	@Test
	public void testBinarytoOther() {

		assertEquals("3", Converter.BINARY.convertTo(Converter.INTEGER, 11));
		assertEquals("15", Converter.BINARY.convertTo(Converter.DOUBLE, 1111));
		assertEquals("17", Converter.BINARY.convertTo(Converter.OCTAL, 1111));
		assertEquals("f", Converter.BINARY.convertTo(Converter.HEXADECIMAL, 1111));
		// when string is passed as parameter
		assertEquals("179", Converter.BINARY.convertTo(Converter.INTEGER, "10110011"));
		assertEquals("179", Converter.BINARY.convertTo(Converter.DOUBLE, "10110011"));
		assertEquals("263", Converter.BINARY.convertTo(Converter.OCTAL, "10110011"));
		assertEquals("b3", Converter.BINARY.convertTo(Converter.HEXADECIMAL, "10110011"));

	}

	@Test
	public void testIntegertoOther() {

		assertEquals("101011", Converter.INTEGER.convertTo(Converter.BINARY, 43));
		assertEquals("43.0", Converter.INTEGER.convertTo(Converter.DOUBLE, 43));
		assertEquals("53", Converter.INTEGER.convertTo(Converter.OCTAL, 43));
		assertEquals("2b", Converter.INTEGER.convertTo(Converter.HEXADECIMAL, 43));
		// when string is passed as parameter
		assertEquals("101100", Converter.INTEGER.convertTo(Converter.BINARY, "44"));
		assertEquals("47.0", Converter.INTEGER.convertTo(Converter.DOUBLE, "47"));
		assertEquals("1135", Converter.INTEGER.convertTo(Converter.OCTAL, "605"));
		assertEquals("1b", Converter.INTEGER.convertTo(Converter.HEXADECIMAL, "27"));

	}

	@Test
	public void testDoubletoOther() {

		assertEquals("101011", Converter.DOUBLE.convertTo(Converter.BINARY, 43.2));
		assertEquals("43", Converter.DOUBLE.convertTo(Converter.INTEGER, 43.4));
		assertEquals("53", Converter.DOUBLE.convertTo(Converter.OCTAL, 43.5));
		assertEquals("2b", Converter.DOUBLE.convertTo(Converter.HEXADECIMAL, 43.31));
		// when string is passed as parameter
		assertEquals("101100", Converter.DOUBLE.convertTo(Converter.BINARY, "44.23"));
		assertEquals("47", Converter.DOUBLE.convertTo(Converter.INTEGER, "47.2"));
		assertEquals("1135", Converter.DOUBLE.convertTo(Converter.OCTAL, "605.4"));
		assertEquals("1b", Converter.DOUBLE.convertTo(Converter.HEXADECIMAL, "27.5"));

	}

	@Test
	public void testOctaltoOther() {

		assertEquals("10111110", Converter.OCTAL.convertTo(Converter.BINARY, 276));
		assertEquals("190", Converter.OCTAL.convertTo(Converter.INTEGER, 276));
		assertEquals("190.0", Converter.OCTAL.convertTo(Converter.DOUBLE, 276));
		assertEquals("be", Converter.OCTAL.convertTo(Converter.HEXADECIMAL, 276));
		// when string is passed as parameter
		assertEquals("10111110", Converter.OCTAL.convertTo(Converter.BINARY, "276"));
		assertEquals("190", Converter.OCTAL.convertTo(Converter.INTEGER, "276"));
		assertEquals("190.0", Converter.OCTAL.convertTo(Converter.DOUBLE, "276"));
		assertEquals("be", Converter.OCTAL.convertTo(Converter.HEXADECIMAL, "276"));

	}

	@Test
	public void testHextoOther() {

		assertEquals("1001110110", Converter.HEXADECIMAL.convertTo(Converter.BINARY, 276));
		assertEquals("630", Converter.HEXADECIMAL.convertTo(Converter.INTEGER, 276));
		assertEquals("630.0", Converter.HEXADECIMAL.convertTo(Converter.DOUBLE, 276));
		assertEquals("1166", Converter.HEXADECIMAL.convertTo(Converter.OCTAL, 276));
		// when string is passed as parameter
		assertEquals("10111011", Converter.HEXADECIMAL.convertTo(Converter.BINARY, "bb"));
		assertEquals("187", Converter.HEXADECIMAL.convertTo(Converter.INTEGER, "bb"));
		assertEquals("187.0", Converter.HEXADECIMAL.convertTo(Converter.DOUBLE, "bb"));
		assertEquals("273", Converter.HEXADECIMAL.convertTo(Converter.OCTAL, "bb"));

	}

}
