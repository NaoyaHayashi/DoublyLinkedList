
public class MyDeque<ItemType> {
	private DoubleLinkedList<ItemType> list;
	
	public MyDeque(){
		list = new DoubleLinkedList<ItemType>();;
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.length();
	}
	
	// Add an element. Same behavior as push of stack.
	public void offerFirst(ItemType item){
		list.insertFront(item);
	}
	
	// Add an element to the end of list.
	public void offerLast(ItemType item){
		list.insertEnd(item);
	}
	
	// Remove a most recently added item.
	// Same behavior as pop of stack.
	public ItemType pollFirst() throws NullPointerException{
		try{
			return list.removeFront();
		}
		catch(NullPointerException e){
			throw e;
		}
	}
	
	// Remove a least recently added item.
	// Same behavior as dequeue of queue.
	public ItemType pollLast() throws NullPointerException{
		try{
			return list.removeEnd();
		}
		catch(NullPointerException e){
			throw e;
		}
	}
	
	// Look at a most recently added item.
	// No removal of an element is involved.
	public ItemType peekFirst() throws NullPointerException{
		try{
			return list.seeFirstValue();
		}
		catch(NullPointerException e){
			throw e;
		}
	}
	
	// Look at a least recently added item.
	// No removal of an element is involved.
	public ItemType peekLast() throws NullPointerException{
		try{
			return list.seeLastValue();
		}
		catch(NullPointerException e){
			throw e;
		}
	}
	
	// Print all the items stored in the deque (sort of repetitive peek starting at front)
	// This method takes advantage of iterator in DoubleLinkedList class.
	// This method is not one of the deque's operations, but I added this to test iterator.
	// This method expects that ItemType is one of the primitive data types; otherwise, it is unlikely to work.
	public void print(){
		for(ItemType item : list){
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
}
