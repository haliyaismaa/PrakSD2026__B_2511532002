package pekan4_2511532002;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532002 {

	public static void main(String[] args) {
		Queue<Integer> q_2002 =new LinkedList<Integer>();
		q_2002.add(1);
		q_2002.add(2);
		q_2002.add(3);
		
		System.out.println("Sebelum reverse "+ q_2002);
		Stack<Integer> s_2002 = new Stack<Integer>();
		while (!q_2002.isEmpty()) {
			s_2002.push(q_2002.remove());
		}
		while (!s_2002.isEmpty()) {
			q_2002.add(s_2002.pop());
		}
		System.out.println("Sesudah reverse = "+q_2002);
		}
}
