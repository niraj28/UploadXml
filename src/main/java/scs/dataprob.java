package scs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dataprob {
	
	public static void main(String args[]) {
		
		
		String s= " The Antarctic blue whale is the biggest animal on the planet " ;
		  //         Output     “The  animal Antarctic biggest blue is on planet whale ”
		// "The"=3, animal=1, biggest=5, blue=3      3,3,1,5    5,3,3,1,   
		HashMap<String,Integer> stringCount= new HashMap<String,Integer>();

		String[] statement=s.split(" ");


		for(String str: statement){
			
			

		    
		    if(stringCount.containsKey(str)){
		        
		        int count = stringCount.get(str);
		        
		        stringCount.put(str, count+1);
		        
		    }else{
		    	
		        stringCount.put(str, 1);
		        
		    }
		    
		}
		 
		 int[] arr= new int[stringCount.size()];
		 int k=0;
		for(Map.Entry<String,Integer> data: stringCount.entrySet()){
		    
		    arr[k]=data.getValue();
		    k++;
		}
		Arrays.sort(arr);// 5,3,3,1

		List<String> listString= new ArrayList<>();
		int p=0;
		for(int m=0;m<stringCount.size();m++){
		for(Map.Entry<String,Integer> data: stringCount.entrySet()){

		    if(!listString.contains(data.getKey())){
		        if(data.getValue()==arr[p]){
		        System.out.println(data.getKey());
		        listString.add(data.getKey());
		    }
		    }
		    }
		}
		
	}

	
	

}
