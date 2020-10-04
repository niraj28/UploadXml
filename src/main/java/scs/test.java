/**
 * 
 */
package scs;


/**
 * @author nirajk
 *
 */
public class test {
	
	
	public static void main(String args[]) {
	
		newMethod("aaabbbcckkm");
		
	}
	
	public static String newMethod(String message) {
	int begin = 0;
	int end = 0;
	
	int travel = 0;
	String builder="";
	int count = 0;
	
	for(travel = 0;travel < message.length();travel++) {
		if(message.charAt(begin) != message.charAt(end)) {
			count = end-begin;
			if(count ==1) {
				builder=builder+message.charAt(begin);
			}
			else if(count>1) {
				builder=builder+message.charAt(begin) + count;
			}
			begin=end;
			end++;
		}else {
			end++;
		}
	}
	
	count = end-begin;
	if(count ==1) {
		builder=builder+message.charAt(begin);
	}
	else if(count>1) {
		builder=builder+message.charAt(begin) + count;
	}
	
	return builder;
	}
	
	

}
