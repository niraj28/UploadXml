package scs;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class newFrescano extends FrescanoQuestion {
	
	public void data() {
		System.out.println("data newFrscano");
	}
	
	Map<Integer, String> concurrentMAP = new ConcurrentHashMap<Integer, String>();
	
	
	
	public static void main (String args[]) {
		newFrescano newFres= new newFrescano();
		newFres.data();
		int start=11, end=20;
		int counter=0;
		int counterGrp=0;
		for( ;start<=end;start++ ) {
			if(counterGrp<3) {
			if(counter<4) {
				System.out.println(start);
				counter++;
			}
			else {
			
				System.out.println("||");
				System.out.println(start);
				counter=0;
				counterGrp++;
			}
			}
			if(counterGrp<3 && start==20) {
				start=10;
			}
			
		}
		
	}

}
