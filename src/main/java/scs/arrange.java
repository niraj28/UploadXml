package scs;

public class arrange {
	
	
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,10,11,12,13,14};
//	1,10,3,11,5,14,2,
	int length=arr.length;
	int firstn=length/2;
	System.out.println(length);	
	System.out.println(firstn);
	int j=firstn;
/*	for(int i=0;i<firstn;i++) {
		System.out.println("i is"+arr[i]);
		System.out.println(arr[i]);
		for(;j<length;j++) {
			System.out.println(arr[j]);
			j=j+1;
			break;
		}
	} */
	
	for(int i=0;i<firstn;i++) {
		i=i+1;
		int temp = arr[firstn];
		int p=firstn;
		while(p>i) {
		arr[p]=arr[p-1];
		System.out.println("k is"+arr[p]);
		p--;
		}
		arr[i]=temp;
		firstn=firstn+1;
	//	i++;
		
	}
	
	for(int k=0;k<= arr.length-1;k++) {
		System.out.println("data is"+arr[k]);
	} 

	
	
}

}
