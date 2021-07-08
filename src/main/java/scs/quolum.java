package scs;

import java.util.HashMap;
import java.util.Map;

public class quolum {
	
	private String name;
	
	private String address;
	
	
	
	public static void main(String args[]) {
		
		Map<quolum, Integer>  store= new HashMap<quolum, Integer>();
		
		quolum  q1= new quolum();
		
		q1.name="start";
		q1.address="address";
		
quolum  q2= new quolum();
		
		q2.name="start";
		q2.address="address";
		
		store.put(q1, 1);
		store.put(q2, 2);
		
		if(q1.equals(q2)) {
			System.out.println("true");	
		}else {
			System.out.println("false");
		}
		
		System.out.println("data out  "+ store.get(q1));
		
		System.out.println("data hashCode  "+ q1.hashCode());
		
		System.out.println("data hashCode  "+ q2.hashCode());
		
		
		
	}
	

}
