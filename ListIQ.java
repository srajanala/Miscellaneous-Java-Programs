package interview_questions;
import java.util.*;

public class ListIQ{
	public static void main(String args[]){
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		System.out.println("List l1 : "+l1);

		System.out.println("Print last integer of List 1 : "+l1.get(3));
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(5);
		l2.add(6);
		l2.add(7);
		
		System.out.println("List l2 : "+l2);

		System.out.println("Print first integer of List 2 : "+l2.get(0));
		
		
		if(l1.get(3)==(l2.get(0))){
			System.out.println("Result : "+l2.get(0));
		}
		else{
		
			if (l1.get(3) > l2.get(0)){
				System.out.println(l2.get(0)+" "+l1.get(3));

			}
			else{
				System.out.println(l1.get(3)+" "+l2.get(0));
			}
		}  
		
		
		List<String> str =  new ArrayList<String>();
		str.add("one");
		str.add("two");
		str.add("one");
		
		System.out.println(" == value :"+ str.get(0) == str.get(2));
		System.out.println("equals :" + str.get(0).equals(str.get(2)));
		
	}
}