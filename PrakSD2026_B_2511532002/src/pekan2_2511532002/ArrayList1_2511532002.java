package pekan2_2511532002;

import java.util.ArrayList;

public class ArrayList1_2511532002 {

	public static void main(String[] args) {
		
		//size of time ArrayList
		int n=5;
		
		//Declaring the ArrayList with intitial size n
		ArrayList<Integer> arrli=new ArrayList<Integer>(n);
		
		//Appending new elements at the end of the list
		for (int i =1; i<= n; i++)
			arrli.add(i);
		
		System.out.println(arrli);
		
		//remove element at index (3)
		arrli.remove (3);
		
		//displaying the ArrayList after deletion
		System.out.println(arrli);
		
		//printing elements one by one
		for (int i =0; i<arrli.size (); i++)
			System.out.print(arrli.get(i)+" ");
	}
}