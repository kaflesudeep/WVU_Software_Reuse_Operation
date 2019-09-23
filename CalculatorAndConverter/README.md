# Programming Assignment 1
## Calculation Operation and Number Conversion. 

This Application is able to perform basic arithmetic operation and conversion. 
There is two way to use this program, first is to download the jar file in your application and add this jar to your application and use the in build methods or copy the source code and utilize the methods written. 

-CommonMethods Package has all the methods needed. 

-CalculatorandConversionTest has all the test cases using the Junit

-In the folder CalculateJae there is calculatorAndConverterJar jar file that can be downloaded for reuse purpose. 


## 1. Conversion: 
This program consist of "Converter" enum class that has enum methods. These enum methods can be utilize to make conversion between different number format. 

There are 5 types of enum variable, BINARY, INTEGER, DOUBLE, OCTAL AND HEXADECIMAL. 

	Steps: 
	1. Know the data type of the number we want to pass. 
	2. call the enum name representing your data type. For example if we are passing Binary we do Converter.BINARY...		
	3. call the convert to method of that enum
	5. Here we needs to pass two parameter, the first one is the data type we want to convert our number to and the second parameter is the data we want to convert to.
	For example if we want to convert BINARY to INTEGER 
	Converter.BINARY.convertTo(Converter.INTEGER, 11)
	6. The result will be in String format and parse it as needed. 
	
	
## 2. Basic Arithmetic  Functions
This application supports following arithmetic functions for BINARY, INTEGER, DOUBLE, OCTAL AND HEXADECIMAL: 

- Addition

- Subtraction

- Multiplication

- Division

- Square Root

- Exponent


	Steps: 
	1. use the class Operation to perform this task. 
	2. Create the object of Operation class. 
	3. There are are 6 methods that will perform the basic arithmetic task. 
	4. The return data will be in the format of the first number and will be a string value. 
	
	For Example: 
	##performAddition(11, Converter.BINARY, 2.0, Converter.DOUBLE)
	
	1. This methods takes 4 parameter
		a. First argument: the first number
		b. Second argument: the format of the first number as enum variable.
		c. Third argument: parameter: the second number
		d. Fourth argument: the format of the second number as enum variable.  
		
	2. All the methods will return data in the Second argument format as string. 
	
