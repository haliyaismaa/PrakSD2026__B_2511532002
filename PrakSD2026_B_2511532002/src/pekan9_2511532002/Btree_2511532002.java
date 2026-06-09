package pekan9_2511532002;

public class Btree_2511532002 {
		private Node_2511532002 root_2002;
		private Node_2511532002 currentNode_2002;
		public Btree_2511532002() {
			root_2002=null;
		}
		public boolean search_2002(int data_2002) {
			return search_2002(root_2002, data_2002);
		}
		private boolean search_2002(Node_2511532002 node_2002, int data_2002) {
			if (node_2002.getData_2002() ==data_2002)
				return true;
			if (node_2002.getLeft() != null)
				if (search_2002(node_2002.getLeft(), data_2002))
					return true;
			if (node_2002.getRight_2002() != null)
				if (search_2002(node_2002.getRight_2002(), data_2002))
					return true;
			return false;
		}
		public void printInorder_2002() {
			root_2002.printInorder_2002(root_2002);
		}
		public void printPreorder_2002() {
			root_2002.printPreorder_2002(root_2002);
		}
		public void printPostorder_2002() {
			root_2002.printPostorder_2002(root_2002);
		}
		public Node_2511532002 getRoot_2002() {
			return root_2002;
		}
		 public boolean isEmpty_2002() {
			 return root_2002==null;
		 }
		 public int countNodes_2002() {
			 return countNodes_2002(root_2002);
		 }
		 private int countNodes_2002 (Node_2511532002 node_2002) {
			 int count_2002 =1;
			 if (node_2002 == null) {
				 return 0;
			 }else {
				 count_2002 += countNodes_2002(node_2002.getLeft());
				 count_2002 += countNodes_2002 (node_2002.getRight_2002());
				 return count_2002;
			 }
		 }
		 public void print() {
			 root_2002.print();
		 }
		 public Node_2511532002 getCurrent_2002() {
			 return currentNode_2002;
		 }
		 public void setCurrent_2002 (Node_2511532002 node_2002) {
			 this.currentNode_2002=node_2002;
		 }
		 public void setRoot_2002 (Node_2511532002 root_2002) {
			 this.root_2002=root_2002;
		 }
	}
