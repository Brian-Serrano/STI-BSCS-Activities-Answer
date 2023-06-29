import java.util.Collections;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class HtmlTree {
	JTree tree;
	JFrame frame;

	public HtmlTree() {
		// create frame
		frame = new JFrame();

		// add components to tree
		DefaultMutableTreeNode html = new DefaultMutableTreeNode("html");
		DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
		DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
		html.add(head);
		html.add(body);
		DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
		DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
		head.add(meta);
		head.add(title);
		DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
		DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
		DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
		body.add(ul);
		body.add(h1);
		body.add(h2);
		DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li");
		DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li");
		ul.add(li1);
		ul.add(li2);
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");
		h2.add(a);

		// create tree
		tree = new JTree(html);

		// find the root node and print
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getModel().getRoot();
		System.out.print("Root Node: " + root.toString());
		System.out.println("\n");

		// find the parent nodes and print
		System.out.print("Parent Nodes: ");
		parents(root);
		System.out.println("\n");

		// find the siblings and print
		System.out.print("Siblings: ");
		siblings(root);
		System.out.println("\n");

		// find the one level subtrees and print
		System.out.print("One Level Subtrees: ");
		subtrees(root);
		System.out.println("\n");

		// find the nodes per level and print
		System.out.print("Nodes per level: ");
		levels(root);
		System.out.println("\n");

		// find the depth and print
		System.out.print("Depth: " + root.getDepth());
		System.out.println("\n");

		// find the degree for each one level subtree and print
		System.out.print("Degree for each one level subtree: ");
		degrees(root);
		System.out.println("\n");

		// breadth-first
		System.out.println("Breadth-first: " + Collections.list(root.breadthFirstEnumeration()));
		// pre-order
		System.out.println("Pre-order: " + Collections.list(root.preorderEnumeration()));
		// post-order
		System.out.println("Post-order: " + Collections.list(root.postorderEnumeration()));

		// set frame
		frame.add(tree);
		frame.setTitle("JTree Example");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new HtmlTree();
	}

	// method for finding parent nodes
	public static void parents(DefaultMutableTreeNode node) {
		if (!node.isLeaf()) {
			System.out.print(node.toString() + ", ");
		}
		for (int i = 0; i < node.getChildCount(); i++) {

			parents((DefaultMutableTreeNode) node.getChildAt(i));

			if (node.isLeaf()) {
				return;
			}
		}
	}

	// method for finding siblings
	public static void siblings(DefaultMutableTreeNode node) {
		if (node.getChildCount() > 1) {
			System.out.print(Collections.list(node.children()) + ", ");
		}
		for (int i = 0; i < node.getChildCount(); i++) {

			siblings((DefaultMutableTreeNode) node.getChildAt(i));

			if (node.isLeaf()) {
				return;
			}
		}
	}

	// method for finding one level subtrees
	public static void subtrees(DefaultMutableTreeNode node) {
		if (!node.isLeaf()) {
			System.out.print(node.toString() + " - " + Collections.list(node.children()) + ", ");
		}
		for (int i = 0; i < node.getChildCount(); i++) {

			subtrees((DefaultMutableTreeNode) node.getChildAt(i));

			if (node.isLeaf()) {
				return;
			}
		}
	}

	// method for finding nodes per level
	public static void levels(DefaultMutableTreeNode node) {
		int level = node.getLevel();
		System.out.print(node.toString() + " - " + level + ", ");
		for (int i = 0; i < node.getChildCount(); i++) {

			levels((DefaultMutableTreeNode) node.getChildAt(i));

			if (node.isLeaf()) {
				return;
			}
		}
	}

	// method for finding degree for each one level subtree
	public static void degrees(DefaultMutableTreeNode node) {
		if (!node.isLeaf()) {
			System.out.print(node.toString() + " - " + node.getChildCount() + ", ");
		}
		for (int i = 0; i < node.getChildCount(); i++) {

			degrees((DefaultMutableTreeNode) node.getChildAt(i));

			if (node.isLeaf()) {
				return;
			}
		}
	}
}