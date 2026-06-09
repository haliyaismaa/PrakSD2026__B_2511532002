package pekan9_2511532002;

public class Node_2511532002 {
	int data_2002;
	Node_2511532002 left_2002;
	Node_2511532002 right_2002;
	public Node_2511532002 (int data_2002) {
		this.data_2002=data_2002;
		left_2002=null;
		right_2002=null;
		}
		public void setLeft_2002 (Node_2511532002 node_2002) {
			if (left_2002 == null)
				left_2002 = node_2002;
		}
		public void setRight_2002 (Node_2511532002 node_2002) {
			if (right_2002 == null)
				right_2002= node_2002;
			
		}
		public Node_2511532002 getLeft() {
			return left_2002;
		}
		public Node_2511532002 getRight_2002() {
			return right_2002;
		}
		public int getData_2002() {
			return data_2002;
		}
		public void setData_2002 (int data_2002) {
			this.data_2002=data_2002;
		}
		void printPreorder_2002 (Node_2511532002 node_2002) {
			if (node_2002 == null)
				return;
			System.out.print(node_2002.data_2002+" ");
			printPreorder_2002(node_2002.left_2002);
			printPreorder_2002(node_2002.right_2002);
		}
		void printPostorder_2002 (Node_2511532002 node_2002) {
			if (node_2002 == null)
				return;
			printPostorder_2002(node_2002.left_2002);
			printPostorder_2002(node_2002.right_2002);
			System.out.print(node_2002.data_2002+" ");
		}
	void printInorder_2002(Node_2511532002 node_2002) {
		if (node_2002==null)
			return;
		printInorder_2002(node_2002.left_2002);
		System.out.print(node_2002.data_2002+" ");
		printInorder_2002(node_2002.right_2002);
	}
	public String print() {
		return this.print("", true,"");}
	public String print(String prefix, boolean isTail, String sb) {
		if (right_2002!=null) {
			right_2002.print(prefix + (isTail ? "|  ": "  "), false, sb);
			}
		System.out.println(prefix+(isTail ? "\\--":"/--")+data_2002);
		if (left_2002 != null) {
			left_2002.print(prefix+(isTail? " ":"| "), true, sb);}
		return sb;
	}

}

