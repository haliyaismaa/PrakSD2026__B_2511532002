package pekan6_2511532002;

public class InsertDLL_2511532002 {
	//Menambahkan node di awal DLL
	static NodeDLL_2511532002 insertBegin_2002(NodeDLL_2511532002 head_2002, int data_2002) {
		//buat node baru
	NodeDLL_2511532002 new_node_2002 = new NodeDLL_2511532002(data_2002);
	new_node_2002.next_2002=head_2002;
	if (head_2002 != null) {
		head_2002.prev_2002=new_node_2002;
	}return new_node_2002;
	}
	
	//Fungsi menambahkan node di akhir
	public static NodeDLL_2511532002 insertEnd_2002(NodeDLL_2511532002 head_2002, int newData_2002) {
		NodeDLL_2511532002 newNode_2002=new NodeDLL_2511532002(newData_2002);
		if (head_2002 == null) {
			head_2002 = newNode_2002;
		}else {
			NodeDLL_2511532002 curr_2002=head_2002;
			while (curr_2002.next_2002 != null) {
				curr_2002=curr_2002.next_2002;
			}
			curr_2002.next_2002=newNode_2002;
			newNode_2002.prev_2002=curr_2002;
		}
		return head_2002;
	}
	// Fungsi menambahkan node diposisi tertentu
	public static NodeDLL_2511532002 insertAtPosition_2002(NodeDLL_2511532002 head_2002, int pos_2002, int new_data_2002) {
		NodeDLL_2511532002 new_node_2002=new NodeDLL_2511532002(new_data_2002);
		if (pos_2002 ==  1) {
			new_node_2002.next_2002=head_2002;
			if (head_2002 != null) {
				head_2002.prev_2002=new_node_2002;
			}
			head_2002=new_node_2002;
			return head_2002;
		}
		NodeDLL_2511532002 curr_2002=head_2002;
		
		for (int i = 1; i < pos_2002 -1 && curr_2002 != null; ++i) {
			curr_2002=curr_2002.next_2002;}
		if (curr_2002 == null) {
			System.out.println("Posisi tidak ada");
			return head_2002;
		}
		
		new_node_2002.prev_2002=curr_2002;
		new_node_2002.next_2002=curr_2002.next_2002;
		curr_2002.next_2002=new_node_2002;
		if (new_node_2002.next_2002 != null) {
			new_node_2002.next_2002.prev_2002=new_node_2002;
		}
		return head_2002;
	}
	
	public static void printList(NodeDLL_2511532002 head_2002) {
		NodeDLL_2511532002 curr_2002 =head_2002;
		while (curr_2002 != null) {
			System.out.print(curr_2002.data_2002 + " <-> ");
			curr_2002=curr_2002.next_2002;
		}
		System.out.println();
	}
	
	//Main Program
	public static void main(String[] args) {
		//membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532002 head_2002= new NodeDLL_2511532002(2);
		head_2002.next_2002 = new NodeDLL_2511532002(3);
		head_2002.next_2002.prev_2002 = head_2002;
		head_2002.next_2002.next_2002= new NodeDLL_2511532002(5);
		head_2002.next_2002.next_2002.prev_2002=head_2002.next_2002;
		
		//cetak dll awal
		System.out.println("DLL Awal: ");
		printList(head_2002);
		head_2002=insertBegin_2002(head_2002, 1);
		System.out.println(
				"simpul 1 ditambah di awal: ");
		printList(head_2002);
		
		System.out.println(
				"simpul 6 ditambah di akhir");
		int data_2002=6;
		head_2002=insertEnd_2002(head_2002, data_2002);
		printList(head_2002);
		
		//menambah node 4 diposisi 4
		System.out.println("Tambah node 4 di posisi 4: ");
		int data2_2002=4;
		int pos_2002=4;
		head_2002= insertAtPosition_2002(head_2002, pos_2002, data2_2002);
		printList(head_2002);
	}
}
