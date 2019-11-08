package ExpressionUtilities;

import java.util.ArrayList;

public class ParanthesisHandler {
	
	public String InnermostParenthesis(String string) {
		
		int opening = -1, closing = -1;
		
		for( int i = 0; i < string.length(); ++i) {
			
			if( string.charAt(i) == '(')
				opening = i;
			
			if( string.charAt(i) == ')') {
				closing = i;
				System.out.println(string.substring(opening, closing+1));
				return string.substring(opening, closing+1);
			}
			
		}
		
			return "";
		
	}
	
	public int CalculateResult(String num_string, ArrayList<Integer> numbers, int num) {
    	int result = numbers.get(0), j = 1;
    	
    	System.out.println(num_string);
    	
    	numbers.add(num);
    	
    	for( int i=0; i< num_string.length(); i++) {
    		
    		if( num_string.charAt(i) == '+') {
    			result += numbers.get(j);
    			j++;
    		}
    		
    		if( num_string.charAt(i) == '-') {
    			result -= numbers.get(j);
    			j++;
    		}
    		
    		if( num_string.charAt(i) == 'x') {
    			result = result * numbers.get(j);
    			j++;
    		}
    		
    		
    	}

    	
    	numbers = new ArrayList<Integer>();
    	num_string = "";
    	num = 0;
    	return result;
    }

}
