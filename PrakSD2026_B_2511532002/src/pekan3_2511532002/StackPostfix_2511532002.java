package pekan3_2511532002;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532002 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input_2511532002 = new Scanner (expression);
		while (input_2511532002.hasNext()) {
			if (input_2511532002.hasNextInt()) {			//an operand (int)
				s.push (input_2511532002.nextInt());		//an operators
			}else {
				String operator=input_2511532002.next();
				int operand2 = s.pop();
				int operand1 =s.pop();
				if (operator.equals("+")) {
					s.push(operand1+operand2);
				}else if (operator.equals("-")) {
					s.push(operand1-operand2);
				}else if (operator.equals("*")) {
					s.push(operand1*operand2);
				}else {
					s.push(operand1/operand2);
				}
			}
		}
		input_2511532002.close();
		return s.pop();
	} public static void main (String[] args) {
		System.out.println("Hasil Postfix = "+postfixEvaluate("5 2 4 * + 7 -"));
	}
}