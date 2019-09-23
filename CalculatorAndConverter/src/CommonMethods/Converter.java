package CommonMethods;

import java.math.BigInteger;

public enum Converter {
	BINARY {

		@Override
		public String convertTo(Converter conv, Object source) {
			String val = null;
			switch (conv) {

			case BINARY:
				val = source instanceof String ?  (String) source : ""+ source ;
				break;
			case INTEGER:
				val = source instanceof String ?  ""+Integer.parseInt((String) source, 2) : 
					 ""+Integer.parseInt(""+(Integer) source, 2); 
				break;
			case DOUBLE:
				val = source instanceof String ?  ""+Integer.parseInt((String) source, 2) : 
					""+Integer.parseInt(""+(Integer) source, 2);  
				break;
				
			
				
			case HEXADECIMAL:
				val = source instanceof String ? Integer.toHexString(Integer.parseInt((String) source, 16)) : 
					Integer.toHexString((Integer) Integer.parseInt(""+(Integer) source, 2));
				break;

			case OCTAL:
				val = source instanceof String ? Integer.toOctalString(Integer.parseInt((String) source, 2)) : 
					Integer.toOctalString((Integer) Integer.parseInt(""+(Integer) source, 2));
				break;

			}
			return val;
		}

		

	},
	
	INTEGER {
		@Override
		public String convertTo(Converter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val = source instanceof String ?  Integer.toBinaryString(Integer.parseInt((String) source)) : ""+ Integer.toBinaryString((Integer)source) ;
				break;
			case INTEGER:
				val = source instanceof String ?  (String) source : ""+ source ;

				break;
			case DOUBLE:
				val = source instanceof String ?  ""+Double.parseDouble((String) source) : ""+ (Double)source ;
				break;
				
			case HEXADECIMAL:
				val = source instanceof String ?  Integer.toHexString(Integer.parseInt((String) source)) : ""+ Integer.toHexString((Integer)source) ;
				break;

			case OCTAL:
				val = source instanceof String ?  Integer.toOctalString(Integer.parseInt((String) source)) : ""+ Integer.toOctalString((Integer)source) ;
				break;

			}
			return val;

		}

	
	},
	HEXADECIMAL {
		@Override
		public String convertTo(Converter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val =  Integer.toBinaryString(Integer.parseInt((String)source, 16)) ;
				break;
			case INTEGER:
				val = ""+(Integer.parseInt((String)source, 16)) ;
				break;
			case DOUBLE:
				val = ""+(Integer.parseInt((String)source, 16)) ;
				break;
				
			case HEXADECIMAL:
				val = source instanceof String ?  (String) source : ""+ source ;
				break;

			case OCTAL:
				val =  Integer.toOctalString(Integer.parseInt((String)source, 16)) ;
				break;

			}
			return val;

		}

	
	},
	OCTAL {
		@Override
		public String convertTo(Converter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val = source instanceof String ? Integer.toBinaryString(Integer.parseInt((String) source, 8)) : 
					Integer.toBinaryString(Integer.parseInt(""+source,8));
				break;
			case INTEGER:
				val = source instanceof String ? ""+Integer.parseInt((String) source, 8) : 
					""+Integer.parseInt(""+source,8);

				break;
				
			case DOUBLE:
				val = source instanceof String ? ""+Integer.parseInt((String) source, 8) : 
					""+(Integer.parseInt(""+source,8));
				break;

				
			case HEXADECIMAL:
				val = source instanceof String ? Integer.toHexString(Integer.parseInt((String) source, 8)) : 
					Integer.toHexString(Integer.parseInt(""+source,8));
				break;

			case OCTAL:
				val = source instanceof String ?  (String) source : ""+ source ;
				break;
				

			}
			return val;

		}

		
	},
	
	DOUBLE {
		@Override
		public String convertTo(Converter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val = source instanceof String ?  Integer.toBinaryString(((Double)Double.parseDouble((String) source)).intValue()) : ""+ Integer.toBinaryString(((Double) source).intValue()) ;
				break;
			case INTEGER:
				val = source instanceof String ?  ""+((Double)Double.parseDouble((String) source)).intValue() : ""+ ((Double) source).intValue() ;

				break;
			case HEXADECIMAL:
				val = source instanceof String ?  Integer.toHexString(((Double)Double.parseDouble((String) source)).intValue()) : ""+ Integer.toHexString(((Double) source).intValue()) ;
				break;

			case OCTAL:
				val = source instanceof String ?  Integer.toOctalString(((Double)Double.parseDouble((String) source)).intValue()) : ""+ Integer.toOctalString(((Double) source).intValue()) ;
				break;

			
			case DOUBLE:
				val = source instanceof String ? ""+ Double.valueOf((String)source) : 
					""+Double.valueOf((double) source); 
				break;

			}
		    
			
			return val;
		
		}

		
	};
	
	public static Integer returnDouble(Object val) {
		Double db = (Double) val;
		
		
		return db.intValue();
	}

	public String convertTo(Converter conv, Object source) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}