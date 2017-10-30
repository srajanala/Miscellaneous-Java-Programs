package interview_questions;

import java.util.*;

class ListIQKrish{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println(str);
		String arr1[] = str.split(",");
		
		String str1= s.nextLine();
		System.out.println(str1);
		String arr2[] = str1.split(",");
		
		int last = Integer.parseInt(arr1[arr1.length-1]);
		int first = Integer.parseInt(arr2[0]);
		
		if(last==first){
			System.out.println(last);
		}
		else{
			if(last>first){
				System.out.println(first+" "+last);
			}else
			{
				System.out.println(last+" "+first);
			}
		}
		
		
	}
}