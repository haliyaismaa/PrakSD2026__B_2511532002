package pekan5_2511532002;

public class PencarianSLL_2511532002 {
	static boolean searchKey (NodeSLL_2511532002 head_2002, int key_2002) {
		NodeSLL_2511532002 curr_2002 = head_2002;
		while (curr_2002 != null) {
			if (curr_2002.data_2002 == key_2002)
				return true;
			curr_2002=curr_2002.next_2002;
		}
		return false;
	}
	public static void travelsal (NodeSLL_2511532002 head_2002) {
		//mulai dari head
		NodeSLL_2511532002 curr_2002 = head_2002;
		//telusuri sampai pointer null
		while (curr_2002 != null) {
			System.out.print(" "+curr_2002.data_2002);
			curr_2002 = curr_2002.next_2002; }
		System.out.println(); }
	
	public static void main(String[] args) {
		NodeSLL_2511532002 head_2002 = new NodeSLL_2511532002(14);
		head_2002.next_2002=new NodeSLL_2511532002(21);
		head_2002.next_2002.next_2002=new NodeSLL_2511532002(13);
		head_2002.next_2002.next_2002.next_2002=new NodeSLL_2511532002(30);
		head_2002.next_2002.next_2002.next_2002.next_2002=new NodeSLL_2511532002(10);
		
		System.out.println("Penulusuran SLL: ");
		travelsal(head_2002);
		
		//data yang akan dicari
		int key_2002=30;
		System.out.print("\nCari data "+key_2002+" = ");
		if (searchKey(head_2002, key_2002))
			System.out.print("Ketemu ");
		else 
				System.out.print("Tidak ada!");
	}
}