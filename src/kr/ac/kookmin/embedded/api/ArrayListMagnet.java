package kr.ac.kookmin.embedded.api;

import java.util.*;

public class ArrayListMagnet {
	
	public static void printAL(ArrayList<String> al){
		
		for(String e : al)
		{
			System.out.print(e + " ");
		}
		
		System.out.println(" ");
		
	}

	public static void main(String[] args){
		
		ArrayList<String> A = new ArrayList<String>();
		
		A.add(0, "zero");
		A.add(1, "one");
		A.add(2, "two");
		A.add(3, "three");
		
		printAL(A);
		
		A.remove(2);
		if (A.contains("two")){
			A.add("2.2");
		}
		
		if (A.contains("three")){
			A.add("four");
		}
		
		printAL(A);
		
		if(A.indexOf("four") != 4){
			A.add(4, "4.2");
		}
		
		printAL(A);
		printAL(A);
		
	}
	
}
