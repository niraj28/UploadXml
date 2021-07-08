package scs;

public class Rle {
	
	//How do you find the missing number in a given integer array of 1 to 100

	//How are duplicate nodes removed in an unsorted linked list
	
	public static void main(String args[]) {
/*	int arr[] = {1,2,3,4,6,7,8,9,10,11};
	
	int n=arr.length+1;
	
	int sum=n*(n+1)/2;
	
	int sumData=0;
	
	for(int i=0;i<n-1;i++) {
		sumData=sumData+arr[i];
	}
	
	int result=sum-sumData;
	
	System.out.println("Result " + result); */
		
		
		Node forward3=new Node(2,null);
		
		Node forward2=new Node(5,forward3);
		
		Node forward=new Node(5,forward2);	
		
	Node p= new Node(1, forward);
	
	Node head=p;
	
	Node move=head;
	Node first=head;
	
	while(first.next!=null) {
	while(head.next!=null) {
		head=head.next;
		if(head.data == first.data) {
			first.next=first.next.next;
			System.out.println(p.toString());
			return;
		}
	}
	first=move.next;
	head=first;
	}
	System.out.println(p.toString());
	

}
}
