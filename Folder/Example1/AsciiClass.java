package interview_questions;

import java.util.*;

public class AsciiClass {

	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
		String arr[] = str.split(",");
		
		boolean firstpass = false;
		for(int i=0;i<=arr.length-1;i++){
        	int a=arr[i].charAt(0);
        	if((a>=65 && a<=90) || (a>=97 && a<=122)){
        		if(firstpass)
            		System.out.print(",");
        		firstpass = true;
        		System.out.print(arr[i]);
        	}
        	
        }
		
		System.out.print(" | ");
		
		firstpass = false;
        for(int i=0;i<=arr.length-1;i++){
        	
        	int a=arr[i].charAt(0);
        	if(a>=48 && a<=57){
        		if(firstpass)
            		System.out.print(",");
        		
        		firstpass = true;
        		System.out.print(arr[i]);
        	}
        }
        

	
}
}
