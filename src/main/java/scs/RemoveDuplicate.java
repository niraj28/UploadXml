package scs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {
	
	 public static int removeDuplicates(int[] nums) {
	        Set<Integer> remove= new HashSet<Integer>();
	        int result=0;
	        for(int i=0;i<nums.length;i++){
	        if(!remove.contains(nums[i])){
	           remove.add(nums[i]); 
	        }
	        }
	          Iterator value = remove.iterator(); 
	        int l=0;
	        while (value.hasNext()) {
	         nums[l]=(Integer)value.next();
	            l++;
	        }
	        
	        return remove.size();
	    }
	 
	 public static void main(String[] args) {
	    	int[] nums= new int[]{-3,-1};
	    	System.out.println(removeDuplicates(nums));
	    }

}
