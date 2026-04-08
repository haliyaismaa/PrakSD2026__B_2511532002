package pekan3_2511532002;

import java.util.Stack;

public class NilaiMaksimum {
	public static int max(Stack<Integer>s) {
		Stack <Integer> backup_2511532002 = new Stack <Integer>();
		int maxValue_2511532002 = s.pop();
		backup_2511532002.push(maxValue_2511532002);
		while (!s.isEmpty()) {
			int next_2511532002 = s.pop();
			backup_2511532002.push(next_2511532002);
			maxValue_2511532002=Math.max(maxValue_2511532002, next_2511532002);
		}
		while (!backup_2511532002.isEmpty()) {
			s.push(backup_2511532002.pop());
		}
		return maxValue_2511532002;
	}
	public static void main(String[] args) {
		Stack<Integer> s =new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("Isi Stack      : "+s);
		System.out.println("Stack Teratas  : "+s.peek());
		System.out.println("Nilai Maksimum : "+max(s));
	}
}
