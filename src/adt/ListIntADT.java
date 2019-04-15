package adt;

// This interface defines the actions associated with a list of integers.
public interface ListIntADT {
	public int get(int i); 		// Return an element from the list at any given position.
	public void insert(int i, int j); 	// Insert an integer j at any position value of the list.
	public void remove(int i);	// Remove the first occurrence of any element from a non-empty list.
	public void removeAt(int i);// Remove the integer at a specified location from a non-empty list.
	public void replace(int i, int j);	// Replace an integer at any position value by another element j.
	public int size();			// Return the number of integers in the list.
	public boolean isEmpty();	// Return true if the list is empty, otherwise return false.
	public boolean isFull();	// Return true if the list is full, otherwise return false.
}