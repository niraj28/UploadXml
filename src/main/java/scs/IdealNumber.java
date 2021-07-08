package scs;

import java.util.ArrayList;

public class IdealNumber {
	public static int idealNum(int l, int r) {
/*	    int count  = 0;
	  
	    int power = 0;
	    ArrayList<Integer> powerOfthree = new ArrayList();
	    ArrayList<Integer> powerOffive = new ArrayList();
//	    if(low==1){
//	         count++;
//	     }

	    while(Math.pow(3,power) <= high || Math.pow(5,power) <= high){
	        powerOfthree.add((int) Math.pow(3,power));
	        powerOffive.add((int) Math.pow(5,power));
	        power++;

	    }

	    for(int i : powerOfthree)
	        for(int j :powerOffive ) {
	            if (i*j > low && i*j < high) count++;
	        } */
		
//		if (l == 1)  
 //       l++;  
  
    int count = 0;  
  
    for (int i = l; i <= r; i++) {  
        int num = i;  
  
        // While num is divisible by 2, divide it by 2  
        while (num % 3 == 0)  
            num /= 3;  
  
        // While num is divisible by 3, divide it by 3  
        while (num % 5 == 0)  
            num /= 5;  
  
        if (num == 1)  
            count++;  
    }  
  
    System.out.println(count);


	    return count;
	}
	
	public static void main(String args[]) {
		System.out.println(idealNum(73, 7077888));
	}
}
