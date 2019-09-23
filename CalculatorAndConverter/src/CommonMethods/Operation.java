package CommonMethods;

public class Operation {

	 public Object performAddition(Object num1, Converter first, Object num2, Converter second){
//		 1. convert all number to int 
		 String firstNum,secondNum; 
		 int resultInt ; 
		 double resultDouble; 
		 if(first.equals(Converter.DOUBLE)){
			  firstNum = first.convertTo(Converter.DOUBLE, num1); 
			  secondNum = second.convertTo(Converter.DOUBLE, num2);
			  resultDouble = Double.parseDouble(firstNum)+ Double.parseDouble(secondNum); 
			  return ""+resultDouble;
			  
		 }else{
			  firstNum = first.convertTo(Converter.INTEGER, num1); 
			  secondNum = second.convertTo(Converter.INTEGER, num2); 
			  resultInt = Integer.parseInt(firstNum)+ Integer.parseInt(secondNum); 
			  return Converter.INTEGER.convertTo(first, resultInt);
		 }
	 }
	 
	 
	 public Object performSubtraction(Object num1, Converter first, Object num2, Converter second){
//		 1. convert all number to int 
		 String firstNum,secondNum; 
		 int resultInt ; 
		 double resultDouble; 
		 if(first.equals(Converter.DOUBLE)){
			  firstNum = first.convertTo(Converter.DOUBLE, num1); 
			  secondNum = second.convertTo(Converter.DOUBLE, num2);
			  resultDouble = Double.parseDouble(firstNum)-Double.parseDouble(secondNum); 
			  return ""+resultDouble;
			  
		 }else{
			  firstNum = first.convertTo(Converter.INTEGER, num1); 
			  secondNum = second.convertTo(Converter.INTEGER, num2); 
			  resultInt = Integer.parseInt(firstNum)- Integer.parseInt(secondNum); 
			  return Converter.INTEGER.convertTo(first, resultInt);
		 }
	 }
	 
	 
	 public Object performMultiplication(Object num1, Converter first, Object num2, Converter second){
//		 1. convert all number to int 
		 String firstNum,secondNum; 
		 int resultInt ; 
		 double resultDouble; 
		 if(first.equals(Converter.DOUBLE)){
			  firstNum = first.convertTo(Converter.DOUBLE, num1); 
			  secondNum = second.convertTo(Converter.DOUBLE, num2);
			  resultDouble = Double.parseDouble(firstNum)*Double.parseDouble(secondNum); 
			  return ""+resultDouble;
			  
		 }else{
			  firstNum = first.convertTo(Converter.INTEGER, num1); 
			  secondNum = second.convertTo(Converter.INTEGER, num2); 
			  resultInt = Integer.parseInt(firstNum)* Integer.parseInt(secondNum); 
			  return Converter.INTEGER.convertTo(first, resultInt);
		 }
	 }
	 
	 
	 
	 public Object performDivision(Object num1, Converter first, Object num2, Converter second){
//		 1. convert all number to int 
		 String firstNum,secondNum; 
		 int resultInt ; 
		 double resultDouble; 
		 
		 try{
			 if(first.equals(Converter.DOUBLE)){
				  firstNum = first.convertTo(Converter.DOUBLE, num1); 
				  secondNum = second.convertTo(Converter.DOUBLE, num2);
				  resultDouble = Double.parseDouble(firstNum)/Double.parseDouble(secondNum); 
				  return ""+resultDouble;
				  
			 }else{
				  firstNum = first.convertTo(Converter.INTEGER, num1); 
				  secondNum = second.convertTo(Converter.INTEGER, num2); 
				  resultInt = Integer.parseInt(firstNum)/ Integer.parseInt(secondNum); 
				  return Converter.INTEGER.convertTo(first, resultInt);
			 }
		 }catch (Exception ex){
			 System.out.println("Error Occurred: ");
			 System.out.println(ex.getMessage());
		 }finally{
			 return "Infinite"; 
		 }
		
	 }
	 
	 
	 public Object performSquareRoot(Object num1, Converter first){
//		 1. convert all number to int 
		 String firstNum,secondNum; 
		 int resultInt ; 
		 double resultDouble; 
		 if(first.equals(Converter.DOUBLE)){
			  firstNum = first.convertTo(Converter.DOUBLE, num1); 
			  resultDouble = Double.parseDouble(firstNum);
			  
			  return ""+Math.sqrt(resultDouble);
			  
		 }else{
			  firstNum = first.convertTo(Converter.INTEGER, num1);  
			  resultInt = Integer.parseInt(firstNum);
			  int a = (int) Math.sqrt(resultInt);
			  return Converter.INTEGER.convertTo(first, a);
		 }
	 }
	 
	 
	 
}
