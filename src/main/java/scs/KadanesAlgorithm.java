/**
 * 
 */
package scs;


/**
 * @author nirajk
 *
 */
public class KadanesAlgorithm {
	
	public static void main(String args[]) {
		
		maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		
	}

	    public static int maxSubArray(int[] nums) {
	    
	        int current_sum =0;
	        int global_sum  =0;
	        current_sum = nums[0];
	        for(int i=1;i<nums.length;i++){        
	          if(current_sum < nums[i] ) {
	              current_sum= nums[i];
	          }
	         else if(current_sum< current_sum+nums[i]){
	              current_sum= current_sum+nums[i];  
	            }
	         else if(current_sum> current_sum+nums[i]){
	              current_sum= current_sum+nums[i];  
	            }
	        if(current_sum>global_sum){
	        	System.out.println("current_sum"+current_sum);
	            global_sum=current_sum;
	        }
	        }
	  System.out.println("global_sum"+global_sum);
	        return global_sum;
	    }  
	}

