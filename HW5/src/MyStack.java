
public class MyStack<ItemType> {
	private DoubleLinkedList<ItemType> list;
	
	public MyStack(){
		list = new DoubleLinkedList<ItemType>();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.length();
	}
	
	public void push(ItemType item){
		list.insertFront(item);
	}
	
	public ItemType pop() throws NullPointerException{
		try{	
			return list.removeFront();
		}
		catch(NullPointerException e){
			throw e;
		}
	}
	
}
