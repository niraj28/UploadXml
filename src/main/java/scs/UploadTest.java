package scs;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsxReader;

public class UploadTest {
	public static void main(String args[]) {
	
	String s="aa";
	      int stringLength = s.length();
	           
	        int maxLength=0;
	        String returnString= "";
	        if(stringLength==1) {
	        	System.out.println(s);
	        }
	        
	    for(int i=0; i<= stringLength-1 ; i++)
	    {        
	        for(int j=stringLength; j>=i; j--)
	        {
	            StringBuilder resversString = new StringBuilder();
	            if(s.substring(i,j).equals(new String(resversString.append(s.substring(i,j)).reverse())))
	            {
	              if(maxLength < s.substring(i,j).length()){
	            	  maxLength=s.substring(i,j).length();
	               returnString = s.substring(i,j);  
	              }   
	            }
	       }
	    }
	    
	    String n = new String("null");
	        System.out.println(n);
	        
	    }
}

