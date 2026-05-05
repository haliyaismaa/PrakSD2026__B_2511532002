package pekan5_2511532002;

public class TambahSLL_2511532002 {
	public static NodeSLL_2511532002 insertAtFront(NodeSLL_2511532002 head_2002, int value_2002) {
		NodeSLL_2511532002 new_node_2002= new NodeSLL_2511532002 (value_2002);
		new_node_2002.next_2002=head_2002;
		return new_node_2002;
	}
	
	//Fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532002 insertAtEnd (NodeSLL_2511532002 head_2002, int value_2002) {
		
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511532002 newNode_2002=new NodeSLL_2511532002 (value_2002);
		
		//jika List kosong maka node menjadi head
		if (head_2002 == null) {
			return newNode_2002;
		}
		
		//Simpan Head ke variabel sementara
		NodeSLL_2511532002 last_2002=head_2002;
		//telusuri ke node akhir
		while (last_2002.next_2002 != null) {
			last_2002 = last_2002.next_2002;
		}
		
		//Ubah pointer
		last_2002.next_2002=newNode_2002;
		return head_2002;
	}
	static NodeSLL_2511532002 GetNode (int data_2002) {
		return new NodeSLL_2511532002(data_2002);
	}
	
	static NodeSLL_2511532002 insertPos (NodeSLL_2511532002 headNode_2002, int position_2002, int value_2002) {
		NodeSLL_2511532002 head_2002= headNode_2002;
		
		if (position_2002 <1)
			System.out.println("Invalid Position!");
		if (position_2002 ==1) {
			NodeSLL_2511532002 new_node_2002 = new NodeSLL_2511532002 (value_2002);
			new_node_2002.next_2002=head_2002;
			return new_node_2002;
		}else {
			while (position_2002-- != 0) {
				if (position_2002 == 1) {
					NodeSLL_2511532002 newNode_2002 = GetNode (value_2002);
					newNode_2002.next_2002=headNode_2002.next_2002;
					headNode_2002.next_2002=newNode_2002;
					break;
				}
				headNode_2002 =headNode_2002.next_2002;
			}
			if (position_2002 != 1) 
				System.out.println("Posisi diluar jangkauan!");
			return head_2002;
		}
		}
			public static void printList(NodeSLL_2511532002 head_2002) {
				NodeSLL_2511532002 curr_2002=head_2002;
				while (curr_2002.next_2002 != null) {
					System.out.print(curr_2002.data_2002+" --> ");
					curr_2002 =curr_2002.next_2002;
				}
				if (curr_2002.next_2002==null) {
					System.out.println(curr_2002.data_2002);
					System.out.println();
				}
			}

				
	//Main Program
	public static void main(String[] args) {
		
		//Buat Linked List 2 -> 3 -> 5 -> 6
		NodeSLL_2511532002 head_2002 = new NodeSLL_2511532002(2);
		head_2002.next_2002 = new NodeSLL_2511532002(3);
		head_2002.next_2002.next_2002 = new NodeSLL_2511532002(5);
		head_2002.next_2002.next_2002.next_2002 = new NodeSLL_2511532002(6);
		
		//Cetak list Asli
		System.out.println("Senerai Berantai awal: ");
		printList(head_2002);
		
		//Tambahkan Node baru di depan
		System.out.println("tambah 1 simpul di depan: ");
		int data_2002=1;
		head_2002 = insertAtFront (head_2002, data_2002);
		
		//Cetak Update list
		printList(head_2002);
		
		//Tambahkan Node baru di belakang
		System.out.println("tambah 1 simpul di belakang: ");
		int data2_2002=7;
		head_2002 =insertAtEnd(head_2002, data2_2002);
		
		//Cetak Update List
		printList(head_2002);
		System.out.println("tambah 1 simpul ke data 4: ");
		int data3_2002 =4;
		int pos_2002=4;
		head_2002=insertPos (head_2002, pos_2002, data3_2002);
		
		//Cetak Update List
		printList (head_2002);
	}
}

	