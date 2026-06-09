package pekan9_2511532002;


public class BtreeDriver_2511532002 {
	public static void main(String[] args) {
		
		//Membuat pohon
		Btree_2511532002 tree_2002 = new Btree_2511532002();
		System.out.println("Jumlah Simpul Awal Pohon: ");
		System.out.println(tree_2002.countNodes_2002());
		
		//Menambahkan simpul data 1
		Node_2511532002 root_2002=new Node_2511532002(1);
		
		//Menjadikan simpul 1 sebagai root
		tree_2002.setRoot_2002(root_2002);
		System.out.println("Jumlah simpul jika hanya ada root ");
		System.out.println(tree_2002.countNodes_2002());
		Node_2511532002 node2 =new Node_2511532002(2);
		Node_2511532002 node3 =new Node_2511532002(3);
		Node_2511532002 node4 =new Node_2511532002(4);
		Node_2511532002 node5 =new Node_2511532002(5);
		Node_2511532002 node6 =new Node_2511532002(6);
		Node_2511532002 node7 =new Node_2511532002(7);
		Node_2511532002 node8 =new Node_2511532002(8);
		Node_2511532002 node9 =new Node_2511532002(9);
		
		root_2002.setLeft_2002(node2);
		node2.setLeft_2002(node4);
		node2.setRight_2002(node5);
		node4.setRight_2002(node8);
		root_2002.setRight_2002(node3);
		node3.setLeft_2002(node6);
		node3.setRight_2002(node7);
		node6.setLeft_2002(node9);
		
		//Set root
		tree_2002.setCurrent_2002(tree_2002.getRoot_2002());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree_2002.getCurrent_2002().getData_2002());
		System.out.println("Jumlah simpul;  setelah simpul 7 ditambahkan");
		System.out.println(tree_2002.countNodes_2002());
		System.out.println("InOrder: ");
		tree_2002.printInorder_2002();
		System.out.println("\nPreorder: ");
		tree_2002.printPreorder_2002();
		System.out.println("\nPostorder: ");
		tree_2002.printPostorder_2002();
		System.out.println("\nD Menampilkan simpul dalam bentuk  pohon: ");
		tree_2002.print();
	}
}
