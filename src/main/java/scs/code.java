/**
 * 
 */
package scs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nirajk
 *
 */
public class code {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(3);
		list.add(3);
		newMethod(list);
	}

	/**
	 * @param list
	 */
	private static void newMethod(List<Integer> list) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> newMap = new HashMap<>();
		int countDuplicate=0;
		for(Integer l : list) {
			if(newMap.containsKey(l)) {
			
			newMap.put(l, newMap.get(l)+1);
			
			}
			else {
				newMap.put(l, 1);
			}
		}
		
		System.out.println(newMap);
		for (Map.Entry<Integer, Integer> set : newMap.entrySet()) {
		    if(set.getValue() > 1) {
		    	countDuplicate++;
		    }
		}
		System.out.println(countDuplicate);
		
		
		
	}

}
