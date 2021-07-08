package scs;

public class Merge {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 int end1=m-1;
	        int end2=n-1;
	        if(end1<0 || end2<0){
	            if(end1<0){
	            nums1=nums2;    
	            }
	          }
	        else{ 
	        for(int k=m+n-1; k>0;k--){
	      
	               if(nums1[end1]<nums2[end2]){
	                   nums1[k]=nums2[end2--];
	               }
	            else{
	               nums1[k]= nums1[end1--];
	            }
	        }
	        }
	        for(int l=0;l<nums1.length;l++) {
	        	System.out.print(nums1[l]);
	        }
	       
	    }
	
	public static void main(String args[]) {
		int nums1[] = {0};
		int m=0;
		int n=1;
		int nums2[]= {1};
		
		merge(nums1, m, nums2, n);
	}
}
