package org.einherjer.cs;

public class TreeAndGraph {

//	ver weiss
//	------
//	TREE
//	----
//	preorder (p105)
//	postorder (p106)
//	contains (p.115)
//	min / max (p117)
//	insert (p118)
//	delete (p120)
//	
//	GRAPH
//	-----
//	grafo deep-first search y breadth-first search  (p400)
//	
//	sort topologico (p364)
//	sort topologico con queue (p365)
//	unweighted shortest path (p371)
//	unweighted shortest path con queue (p372)
//	dijktra (p379)
//	camino mas corto weighted con pesos negativos (p381)
//	
//	ejemplo java de unweighted shortest path (p385)
	
//	LIST y OTROS
//	------------
//	List: add and remove: arraylist 70, double linkedlist p79/80 (single linkedlist ver cracking the coding interview p49)
//	Stack/Queue: push/pop y enqueue/dequeue: cracking the coding interview p51
//	
	
//	ciclo en linked list
	
	public static void main(String[] args) {
//		driverHasLoop();
		sortedTree();
	}
	
	public static void driverHasLoop() {
		ListNode n5 = new ListNode();
		ListNode n4 = new ListNode(n5);
		ListNode n3 = new ListNode(n4);
		ListNode n2 = new ListNode(n3);
		ListNode n1 = new ListNode(n2);
		n5.next = n3;
		System.out.println(hasLoop(n1));
	}
	private static class ListNode {
		int val = 0;
		ListNode next = null;
		public ListNode(){}
		public ListNode(ListNode next){this.next = next;}
		public ListNode(int v){val=v;}
	}
	public static boolean hasLoop(ListNode first) {

	    ListNode slow, fast; // create two references.
	    slow = fast = first; // make both refer to the start of the list.
	
	    while(true) {

	    	if(slow == null || fast == null) // if either hits null..no loop.
	            return false;
	    	
	    	slow = slow.next;          // 1 hop.
	
	        if(fast.next == null)
	        	return false; //reaching null means no loop
	        else
	            fast = fast.next.next; // 2 hops.
	
	        if(slow == fast) // if the two ever meet...we must have a loop.
	            return true;
	    }
	}
	
	//validar si un arbol binario esta sorted
	public static void sortedTree() {
		TreeNode n1 = new TreeNode(1, null, null);
		TreeNode n5 = new TreeNode(5, null, null);
		TreeNode n2 = new TreeNode(2, n1, null);
		TreeNode n4 = new TreeNode(4, null, n5);
		TreeNode n3 = new TreeNode(3, n2, n4);
		System.out.println(sorted(n3));
	}
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public static boolean sorted(TreeNode t) {
		if (t==null) {
			return true;
		}
		return (t.left==null || (t.left!=null&&t.left.val<t.val)) &&
				(t.right==null || (t.right!=null&&t.right.val>t.val)) &&
				sorted(t.right) && sorted(t.left);
	}
	
}
