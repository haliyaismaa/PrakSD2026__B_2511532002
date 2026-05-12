package pekan6_2511532002;

public class HapusDLL_2511532002 {
	public static NodeDLL_2511532002 delHead_2002 (NodeDLL_2511532002 head_2002) {
		if (head_2002 == null) {
			return null;}
			head_2002=head_2002.next_2002;
			if (head_2002 != null) {
				head_2002.prev_2002=null;}
				return head_2002;
			}
			
			//fungsi menghapus di akhir
			public static NodeDLL_2511532002 delLast_2002(NodeDLL_2511532002 head_2002) {
				if (head_2002 == null) {
					return null;}
				if (head_2002.next_2002 ==  null) {
					return null;}
				NodeDLL_2511532002 curr_2002=head_2002;
				while (curr_2002.next_2002 != null) {
					curr_2002 =curr_2002.next_2002;
				}
				
				//update pointer
				if (curr_2002.prev_2002 != null) {
					curr_2002.prev_2002.next_2002=null;}
				return head_2002;

				}

		//fungsi menhapus node posisi tertentu
			public static NodeDLL_2511532002 delPos_2002(NodeDLL_2511532002 head_2002, int pos_2002) {
				if (head_2002 == null) {
					return head_2002;}
				NodeDLL_2511532002 curr_2002=head_2002;
				
				for (int i=1; curr_2002 != null && i <pos_2002; ++i) {
					curr_2002=curr_2002.next_2002;}
					if (curr_2002== null) {
						return head_2002;}
						if(curr_2002.prev_2002 != null) {
							curr_2002.prev_2002.next_2002=curr_2002.next_2002;}
						if (curr_2002.next_2002 != null) {
							curr_2002.next_2002.prev_2002=curr_2002.prev_2002;}
						
						if (head_2002==curr_2002) {
							head_2002=curr_2002.next_2002;}
					
						return head_2002;
					}
				
					//fungsi cetak dll
					public static void printList(NodeDLL_2511532002 head_2002) {
						NodeDLL_2511532002 curr_2002=head_2002;
						while (curr_2002 != null) {
							System.out.print(curr_2002.data_2002+ " <-> ");
							curr_2002 = curr_2002.next_2002;
						}
						System.out.println();
					}
					
					//main program
					public static void main (String[] args) {
						NodeDLL_2511532002 head_2002=new NodeDLL_2511532002(1);
						
						head_2002.next_2002=new NodeDLL_2511532002(2);
						head_2002.next_2002.prev_2002=head_2002;
						
						head_2002.next_2002.next_2002=new NodeDLL_2511532002(3);
						head_2002.next_2002.next_2002.prev_2002=head_2002.next_2002;
						
						head_2002.next_2002.next_2002.next_2002=new NodeDLL_2511532002(4);
						head_2002.next_2002.next_2002.next_2002.prev_2002=head_2002.next_2002.next_2002;
						
						head_2002.next_2002.next_2002.next_2002.next_2002=new NodeDLL_2511532002(5);
						head_2002.next_2002.next_2002.next_2002.next_2002.prev_2002= head_2002.next_2002.next_2002.next_2002;
						
						System.out.println("DLL Awal: ");
						printList(head_2002);
						System.out.println("Setelah head dihapus: ");
						head_2002=delHead_2002(head_2002);
						printList(head_2002);
						System.out.println("Setelah node terakhir dihapus: ");
						head_2002 = delLast_2002(head_2002);
						printList(head_2002);
						System.out.println("Menghapus node ke 2: ");
						head_2002=delPos_2002(head_2002, 2);
						printList(head_2002);
					}
				}