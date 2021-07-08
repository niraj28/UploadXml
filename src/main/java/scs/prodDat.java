package scs;

public class prodDat {
	
	
	
	
	public static void main(String args[]) {
		
		
		int sum=10;
		int[] arr= {1,3,7,4,2,3,9};
		int low=0;
		int mid=1;
		boolean b=false;
		
		
		
		
		for(int i=0;i<arr.length-1;i++) {
			int high=10-(arr[low]+arr[mid]);
			for(int k=mid+1;k<arr.length;k++) {
				if(high==arr[k]) {
					b= true;
					System.out.println("low value "+ arr[low] + "mid value"+ arr[mid] + " b value "+b);
					
					System.out.println("the third value " + arr[k]);
					break;
				}
				
			}
			
			mid++;		
			
		}

		
	}

}
