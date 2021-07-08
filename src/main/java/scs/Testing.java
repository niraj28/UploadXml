package scs;

import java.util.ArrayList;
import java.util.List;

public class Testing {
	private static void printReverse(char [] str) {
		  helper(0, str);
		}

		private static void helper(int index, char [] str) {
		  if (str == null || index >= str.length) {
		    return;
		  }
		  System.out.println(str[index]);
		  helper(index + 1, str);
		  System.out.print(str[index]);
		}
public static void main(String args[]) {
	List<Integer> arrList = new ArrayList<Integer>();
	arrList.add(5);
	char[] JavaCharArray = {'r', 's', 't', 'u', 'v'};
	printReverse(JavaCharArray);
}
}
