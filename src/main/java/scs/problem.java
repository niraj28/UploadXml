package scs;

public class problem {
	
	
	
	public static void main(String args[]) {
		
		
		int arr[]= {-1,1,2};
		int minDis=0;
		if(arr[0]>0) {
			minDis=arr[0];
		}else {
			minDis=-1*arr[0];
		}
			
		
		int dis=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				dis=-1*arr[i]-0;
			}
			else {
				dis=arr[i]-0;
			}
			if(dis<minDis) {
				minDis=dis;
			}
		}
		
		System.out.println(minDis);
	}

}
