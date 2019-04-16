package adt;

public interface StackIntADT {
	public void push(int i); // Insert an element at one end of the stack called top.
	public int pop(); 	// Remove and return the element at the top of the stack, if it is not empty.
	public int peek(); 	// Return the element at the top of the stack without removing it, if the stack is not empty.
	public int size(); 	// Return the number of elements in the stack.
	public boolean isEmpty(); 	// Return true if the stack is empty, otherwise return false.
	public boolean isFull(); 	// Return true if the stack is full, otherwise return false
}
