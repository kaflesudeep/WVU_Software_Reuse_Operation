package CommonMethods;

import java.text.DecimalFormat;

public class Operation {

	public Object performAddition(Object num1, Converter first, Object num2, Converter second) {
		// 1. convert all number to int
		String firstNum, secondNum;
		int resultInt;
		double resultDouble;
		if (first.equals(Converter.DOUBLE)) {
			firstNum = first.convertTo(Converter.DOUBLE, num1);
			secondNum = second.convertTo(Converter.DOUBLE, num2);
			resultDouble = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
			return "" + resultDouble;

		} else {
			firstNum = first.convertTo(Converter.INTEGER, num1);
			secondNum = second.convertTo(Converter.INTEGER, num2);
			resultInt = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
			return Converter.INTEGER.convertTo(first, resultInt);
		}
	}

	public Object performSubtraction(Object num1, Converter first, Object num2, Converter second) {
		// 1. convert all number to int
		String firstNum, secondNum;
		int resultInt;
		double resultDouble;
		if (first.equals(Converter.DOUBLE)) {
			firstNum = first.convertTo(Converter.DOUBLE, num1);
			secondNum = second.convertTo(Converter.DOUBLE, num2);
			resultDouble = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
			DecimalFormat df = new DecimalFormat("###.##");

			return "" + df.format(resultDouble);

		} else {
			firstNum = first.convertTo(Converter.INTEGER, num1);
			secondNum = second.convertTo(Converter.INTEGER, num2);
			resultInt = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
			return Converter.INTEGER.convertTo(first, resultInt);
		}
	}

	public Object performMultiplication(Object num1, Converter first, Object num2, Converter second) {
		// 1. convert all number to int
		String firstNum, secondNum;
		int resultInt;
		double resultDouble;
		if (first.equals(Converter.DOUBLE)) {
			firstNum = first.convertTo(Converter.DOUBLE, num1);
			secondNum = second.convertTo(Converter.DOUBLE, num2);
			resultDouble = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
			DecimalFormat df = new DecimalFormat("###.##");

			return "" + df.format(resultDouble);

		} else {
			firstNum = first.convertTo(Converter.INTEGER, num1);
			secondNum = second.convertTo(Converter.INTEGER, num2);
			resultInt = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
			return Converter.INTEGER.convertTo(first, resultInt);
		}
	}

	public Object performDivision(Object num1, Converter first, Object num2, Converter second) {
		// 1. convert all number to int
		String firstNum, secondNum;
		int resultInt;
		double resultDouble;

		try {
			if (first.equals(Converter.DOUBLE)) {
				firstNum = first.convertTo(Converter.DOUBLE, num1);
				secondNum = second.convertTo(Converter.DOUBLE, num2);
				resultDouble = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
				DecimalFormat df = new DecimalFormat("###.##");
				if (Double.parseDouble(secondNum) > 0) {
					df.format(resultDouble);
				}
				return "" + resultDouble;

			} else {
				firstNum = first.convertTo(Converter.INTEGER, num1);
				secondNum = second.convertTo(Converter.INTEGER, num2);
				resultInt = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
				return Converter.INTEGER.convertTo(first, resultInt);
			}
		} catch (Exception ex) {
			System.out.println("Error Occurred: ");
			System.out.println(ex.getMessage());
			return "Infinity";
		}

	}

	public Object performSquareRoot(Object num1, Converter first) {
		// 1. convert all number to int
		String firstNum, secondNum;
		int resultInt;
		double resultDouble;
		if (first.equals(Converter.DOUBLE)) {
			firstNum = first.convertTo(Converter.DOUBLE, num1);
			resultDouble = Double.parseDouble(firstNum);
			resultDouble = Math.sqrt(resultDouble);
			DecimalFormat df = new DecimalFormat("###.##");

			return "" + df.format(resultDouble);

		} else {
			firstNum = first.convertTo(Converter.INTEGER, num1);
			resultInt = Integer.parseInt(firstNum);
			int a = (int) Math.sqrt(resultInt);
			return Converter.INTEGER.convertTo(first, a);
		}
	}

	
		public Object performExponent(Object num1, Converter first, Object num2, Converter second) {
		// 1. convert all number to int
		String firstNum, secondNum;
		int resultInt;
		double resultDouble;

		try {
			if (first.equals(Converter.DOUBLE)) {
				firstNum = first.convertTo(Converter.DOUBLE, num1);
				secondNum = second.convertTo(Converter.DOUBLE, num2);
				resultDouble = Math.pow(Double.parseDouble(firstNum),  Double.parseDouble(secondNum));
				DecimalFormat df = new DecimalFormat("###.##");
				if (Double.parseDouble(secondNum) > 0) {
					df.format(resultDouble);
				}
				return "" + resultDouble;

			} else {
				firstNum = first.convertTo(Converter.INTEGER, num1);
				secondNum = second.convertTo(Converter.INTEGER, num2);
				resultInt = (int) (resultDouble = Math.pow(Integer.parseInt(firstNum), Integer.parseInt(secondNum)));
				return Converter.INTEGER.convertTo(first, resultInt);
			}
		} catch (Exception ex) {
			System.out.println("Error Occurred: ");
			System.out.println(ex.getMessage());
			return "Infinity";
		}

	}
	
}
