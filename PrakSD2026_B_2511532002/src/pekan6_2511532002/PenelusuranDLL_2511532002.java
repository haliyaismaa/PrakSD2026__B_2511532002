package pekan6_2511532002;

public class PenelusuranDLL_2511532002 {
	static void forwardTravelsal_2002(NodeDLL_2511532002 head_2002) {
		NodeDLL_2511532002 curr_2002=head_2002;
		while (curr_2002 != null) {
			System.out.print(curr_2002.data_2002 + " <-> ");
			curr_2002=curr_2002.next_2002;
		}
		System.out.println();
	}
	
	//fungsi penelusuran mundur
	static void backwardTravelsal_2002(NodeDLL_2511532002 tail_2002) {
		NodeDLL_2511532002 curr_2002=tail_2002;
		while (curr_2002 != null) {
			System.out.print(curr_2002.data_2002 + " <-> ");
			curr_2002=curr_2002.prev_2002;
		}
		System.out.println();
		}
	public static void main (String[] args) {
		NodeDLL_2511532002 head_2002 =new NodeDLL_2511532002(1);
		NodeDLL_2511532002 second_2002 =new NodeDLL_2511532002(2);
		NodeDLL_2511532002 third_2002 =new NodeDLL_2511532002(3);
		
		head_2002.next_2002=second_2002;
		second_2002.prev_2002=head_2002;
		second_2002.next_2002=third_2002;
		third_2002.prev_2002=second_2002;
		
		System.out.println("Penelusuran maju: ");
		forwardTravelsal_2002(head_2002);
		System.out.println("Penelusuran mundur: ");
		backwardTravelsal_2002(third_2002);
	}
}