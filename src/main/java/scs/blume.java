package scs;

public class blume {
	
public static void main(String args[]) {	
	int[] prices = {6,5,4,3,2,1};
	int max=0;
	int min=prices[0];
	for(int i=0; i<prices.length;i++) {
		if(min>=prices[i]) {
			min=prices[i];
		}
			
			if(max<prices[i]-min) {
				max=prices[i]-min;
			}
			System.out.println("iterate"+max);
		}
		
	System.out.println(max);

}
}


