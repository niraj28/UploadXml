package scs;

public class flow {
	
	public static void main(String args[]) {
	
		int arr[] = {1,2,3,4,5,6,7,8,9};
			int i=0;
			int j=0;
          while(j<arr.length) {
        	  
        	  if(arr[j]%2==0) {
        		  int temp=arr[i];
        		  arr[i]=arr[j];
        		  arr[j]=temp;
        		  i++;
        		  
        	  }
        	  else {
        		  j++;
        	  }
        	  
          }
			
		for(int m=0;m<arr.length;m++) {
			System.out.println(arr[m]);	
		}
		}


}
