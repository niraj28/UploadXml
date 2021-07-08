package scs;

import java.util.Arrays;

public class TestingData {
	
	public static void main(String args[]) {
		
		
		
		
/*		int N = 8, M = 5;
			int[]	A = {3, 4, 1, 9, 56, 7, 9, 12};
	//		{3, 4, 9, 7, 9}.    ///{1,3,4,7,9,9,12,56}
			
			Arrays.sort(A);
			int min=A[A.length]-A[0];
			
			for(int i=0;i<A.length;i++) {
			if(min<A[i+5]-A[i]) {
				min=A[i+5]-A[i];
			}
			if(i+5>=A.length) {
				break;
			}
			

		
	}*/
		
		int X = 10;
		int arr[]= {1, 3, 5, 9,  2, -2, 9, 0};

	// - 1 9 0, 2 5 3 /// {-2,0,1,2,3,5,9,9}
	//	List<Integer[]> re
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		
			int left=i+1;
			int right= arr.length;
			while(left<right) {
				if(arr[i]+arr[left]+arr[right]==X) {
				System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
				left++;
				right--;
				}
			else if(arr[i]+arr[left]+arr[right]<X) {
				left++;
				
			}
			else {
				right--;
			}
				
			}
			
			
		}

			
			
	}

}
