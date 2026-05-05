package pekan5_2511532002;

public class HapusSLL_2511532002 {
	
	//Fungsi untuk menghapus Head
	public static NodeSLL_2511532002 deleteHead_2002(NodeSLL_2511532002 head_2002) {
		//jika SLL kosong
		if (head_2002 == null)
			return null;
		
		//pindahkan head ke node berikutnya
		head_2002=head_2002.next_2002;
		//return head baru
		return head_2002;
	}
		//Fungsi menghapus Node terakhir
		public static NodeSLL_2511532002 removeLastNode_2002 (NodeSLL_2511532002 head_2002) {
			//jika list kosong, return null
			if (head_2002==null) {
				return null;
			}
			//jika list satu node, hapus node dan return null
			if (head_2002.next_2002 == null) {
				return null;
			}
			//temukan node terakhir ke dua
			NodeSLL_2511532002 secondLast_2002 = head_2002;
			while (secondLast_2002.next_2002.next_2002 != null) {
				secondLast_2002=secondLast_2002.next_2002;
			}
			//hapus Node terakhir
			secondLast_2002.next_2002=null;
			return head_2002;
		}
	//Fungsi Menghapus Node diposisi tertentu
		public static NodeSLL_2511532002 deleteNode_2002 (NodeSLL_2511532002 head_2002, int position_2002) {
			NodeSLL_2511532002 temp_2002=head_2002;
			NodeSLL_2511532002 prev_2002=null;
			
			//Jika LinkedList NULL
			if (temp_2002 == null)
				return head_2002;
			
			//case 1: Head di hapus
			 if (position_2002==1) {
				 head_2002=temp_2002.next_2002;
				 return head_2002;
			 }
			 
			//case 2: menghapus node ditengah
			// telusuri dari node yang dihapus
				 for (int i=1; temp_2002 != null && i <position_2002; i++) {
					 prev_2002 = temp_2002;
					 temp_2002 = temp_2002.next_2002;
				 }
			//Jika ditemukan hapus node
					 if(temp_2002 != null) {
						 prev_2002.next_2002=temp_2002.next_2002;
					 }else {
						 System.out.println("Data Tidak Ada!");
					 }
					return head_2002;
				 }
				 
			// Fungsi Cetak SLL
			public static void printList (NodeSLL_2511532002 head_2002) {
				NodeSLL_2511532002 curr_2002=head_2002;
				while (curr_2002.next_2002 != null) {
					System.out.print(curr_2002.data_2002+" --> ");
					curr_2002=curr_2002.next_2002;
					if (curr_2002.next_2002 == null) {
						System.out.println 	(curr_2002.data_2002);
					
						System.out.println();
					}
				}
			}
				
				//Kelas Main
				public static void main(String[] args) {
					//Buat SLL 1 -> 2 -> 3-> 4 -> 5 -> 6 -> NULL
					NodeSLL_2511532002 head_2002 = new NodeSLL_2511532002(1);
					head_2002.next_2002=new NodeSLL_2511532002(2);
					head_2002.next_2002.next_2002=new NodeSLL_2511532002(3);
					head_2002.next_2002.next_2002.next_2002=new NodeSLL_2511532002(4);
					head_2002.next_2002.next_2002.next_2002.next_2002=new NodeSLL_2511532002(5);
					head_2002.next_2002.next_2002.next_2002.next_2002.next_2002=new NodeSLL_2511532002(6);
					
					//cetak List Awal
					System.out.println("List awal: ");
					printList(head_2002);
					
					//Hapus Node 
					head_2002 = deleteHead_2002 (head_2002);
					System.out.println("List setelah Head dihapus: ");
					printList(head_2002);
					
					//Hapus Node Terakhir
					head_2002 = removeLastNode_2002(head_2002);
					System.out.println("List setelah Simpul terakhir dihapus: ");
					printList(head_2002);
					
					//Deleting Node Posisi 2
					int position_2002 = 2;
					head_2002 = deleteNode_2002(head_2002, position_2002);
					
					//Print List After Deletion
					System.out.println("List setelah posisi 2 dihapus: ");
					printList(head_2002);
				}
	
		}
		