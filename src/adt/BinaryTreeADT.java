package adt;

public interface BinaryTreeADT {
	public boolean isEmpty();
	public boolean isLeaf(Node n);
	public int size();
	public void insert(Node n);
	public void remove(Object data);
	public Node search(Object data);
	public void clear();
	public Object[] traversalPreOrder();
	public Object[] traversalInOrder();
	public Object[] traversalPostOrder();
	public Object[] traversalBFS();
}