package scs;

public class AscBuy {
	 public static int maxProfit(int[] prices) {
	        int price=0;
	        int profit=0;
	        boolean flag=false;
	        boolean asc=false;
	    for(int i=0;i<prices.length-1; i++){
	         if(prices[i] < prices[i+1]){
	        	 asc=true;
	        if(flag==false){    
	          price=prices[i];
	           flag=true;
	       }
	    else
	        continue;          
	        }
	        else{
	        	if(asc==true) {
	        	profit=profit+prices[i]-price;
	        	}
	            flag=false;
	            }
	    }
	     return profit;   
	    }
	  public static void main(String[] args) {
	    	int[] nums= new int[]{7,1,5,3,6,4};
	    	System.out.println(maxProfit(nums));
	    }
}
