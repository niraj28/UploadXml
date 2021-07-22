package scs;

public class newName {
	
	
	public static void main( String[] args) {

int arr[]={20,25,50,7,-10,-20,-30,-5,1,7,-7};


//arrout={-10,-20,-30,-5,-7,20,25,50,7,1,7}

int j=0;
for(int i=0; i<arr.length;i++){

if(arr[i]<0){
int temp=arr[i];
int counter=i;
while(counter-j > 0){
	arr[counter]=arr[counter-1];
	counter--;
}
arr[j]=temp;
j++;
for(int m=0; m<arr.length;m++){

//System.out.println(arr[m]);
}

}
	
}
for(int i=0; i<arr.length;i++){

System.out.println(arr[i]);
}
	}

}
