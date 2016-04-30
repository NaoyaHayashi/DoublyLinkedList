
/* CMPT 225 - Homework#5
 * 
 * This small project demonstrates how DoubleLinkedList works in Data Structure Stack, Queue, and Deque.
 * MyStack, MyQueue, MyDeque use DoubleLinkedList class to implement each operation.
 * 
 * - MyStack has operations(methods) for Stack(LIFO)
 * - MyQueue has operations(methods) for Queue(FIFO)
 * - MyDeque has operations(methods) for Deque(can do LIFO, LILO, FIFO, FILO) & has peek methods to see an Item.
 * 	 MyDeque uses Iterator in the print() method.
 */


public class Main {
	public static void main(String[] args)
	{
		// *************************************
		// BELOW: TESTING GENERIC IMPLEMENTATION
		// *************************************
		
		// Creating each type of lists to test the generic implementation
		ISimpleList4<Short> shortlist = new DoubleLinkedList<Short>();
		ISimpleList4<Integer> intlist = new DoubleLinkedList<Integer>();
		ISimpleList4<Long> longlist = new DoubleLinkedList<Long>();
		ISimpleList4<Float> floatlist = new DoubleLinkedList<Float>();
		ISimpleList4<Double> doublelist = new DoubleLinkedList<Double>();
		ISimpleList4<Character> chlist = new DoubleLinkedList<Character>();
		ISimpleList4<String> strlist = new DoubleLinkedList<String>();
		
		
		System.out.println("---------Testing for Short---------");
		for(short i=1; i<=5; i++){
			shortlist.insertFront(i);
			System.out.println(i + " was inserted at front of the list.");
		}
		for(int i=1; i<=5; i++){
			System.out.println(shortlist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for Int---------");
		for(int i=1; i<=5; i++){
			intlist.insertFront(i*2);
			System.out.println(i*2 + " was inserted at front of the list.");
		}
		for(int i=1; i<=5; i++){
			System.out.println(intlist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for Long---------");
		for(long i=1; i<=5; i++){
			longlist.insertFront(i*3);
			System.out.println(i*3 + " was inserted at front of the list.");
		}
		for(int i=1; i<=5; i++){
			System.out.println(longlist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for Float---------");
		for(int i=1; i<=5; i++){
			float val = (i + (float)0.1);
			floatlist.insertFront(val);
			System.out.println(val + " was inserted at front of the list.");
		}
		for(int i=1; i<=5; i++){
			System.out.println(floatlist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for Double---------");
		for(int i=1; i<=5; i++){
			double val = i + 0.23;
			doublelist.insertFront(val);
			System.out.println(val + " was inserted at front of the list.");
		}
		for(int i=1; i<=5; i++){
			System.out.println(doublelist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for Character---------");
		char ch = 'A';
		for(int i=1; i<=5; i++){
			chlist.insertFront(ch);
			System.out.println(ch + " was inserted at front of the list.");
			ch++;
		}
		for(int i=1; i<=5; i++){
			System.out.println(chlist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for String---------");
		for(int i=1; i<=5; i++){
			String str = ch + "" + ch + "" + ch + "";
			strlist.insertFront(str);
			System.out.println(str + " was inserted at front of the list.");
			ch++;
		}
		for(int i=1; i<=5; i++){
			System.out.println(strlist.removeFront() + " was removed.");
		}
		
		System.out.println();
		System.out.println("---------Testing for Special Case: Removing an Item from an Empty List---------");
		try{
			System.out.println(strlist.removeFront() + " was removed.");
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		
		// *************************************
		// BELOW: TESTING STACK
		// *************************************
		System.out.println();
		System.out.println("---------Testing for Stack---------");
		MyStack<String> stack = new MyStack<String>();
		System.out.println("pushing \"Hello\"");
		stack.push("Hello");
		System.out.println("pushing \"World\"");
		stack.push("World");
		System.out.println("pushing \"!!!!\"");
		stack.push("!!!!");
		System.out.println("Size Check: The current size of the stack is " + stack.size());
		System.out.println("Checking if the stack is empty...");
		if(stack.isEmpty()){
			System.out.println("The stack is empty. Something must be wrong. :(");
		}
		else{
			System.out.println("The stack is NOT empty as expected. :)");
		}
		try{
			System.out.println("1st pop: The Removed Value is \"" + stack.pop() + "\"");
			System.out.println("2nd pop: The Removed Value is \"" + stack.pop() + "\"");
			System.out.println("3rd pop: The Removed Value is \"" + stack.pop() + "\"");
			System.out.println("4th pop here, trying to pop an element from an empty stack!");
			System.out.println("4th pop: The Removed Value is \"" + stack.pop() + "\"");
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Size Check: The current size of the stack is " + stack.size());
		System.out.println("Checking if the stack is empty...");
		if(stack.isEmpty()){
			System.out.println("The stack is empty as expected. :)");
		}
		else{
			System.out.println("The stack is NOT empty. Something must be wrong. :(");
		}
		
		
		// *************************************
		// BELOW: TESTING QUEUE
		// *************************************
		System.out.println();
		System.out.println("---------Testing for Queue---------");
		MyQueue<String> queue = new MyQueue<String>();
		System.out.println("Enqueueing \"CMPT 120\"");
		queue.enqueue("CMPT 120");
		System.out.println("Enqueueing \"CMPT 125\"");
		queue.enqueue("CMPT 125");
		System.out.println("Enqueueing \"CMPT 150\"");
		queue.enqueue("CMPT 150");
		System.out.println("Enqueueing \"CMPT 225\"");
		queue.enqueue("CMPT 225");
		
		System.out.println("Size Check: The current size of the queue is " + queue.size());
		if(queue.isEmpty()){
			System.out.println("The queue is empty. Something must be wrong. :(");
		}
		else{
			System.out.println("The queue is NOT empty as expected. :)");
		}
		
		try{
			System.out.println("1st dequeue: The Removed Value is \"" + queue.dequeue() + "\"");
			System.out.println("2nd dequeue: The Removed Value is \"" + queue.dequeue() + "\"");
			System.out.println("3rd dequeue: The Removed Value is \"" + queue.dequeue() + "\"");
			System.out.println("4th dequeue: The Removed Value is \"" + queue.dequeue() + "\"");
			System.out.println("5th dequeue here, trying to dequeue an element from an empty queue!");
			System.out.println("5th dequeue: The Removed Value is \"" + queue.dequeue() + "\"");
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Size Check: The current size of the queue is " + queue.size());
		System.out.println("Checking if the queue is empty...");
		if(queue.isEmpty()){
			System.out.println("The queue is empty as expected. :)");
		}
		else{
			System.out.println("The queue is NOT empty. Something must be wrong. :(");
		}
		
		
		// *************************************
		// BELOW: TESTING DEQUE
		// *************************************
		System.out.println();
		System.out.println("---------Testing for Deque---------");
		MyDeque<Character> deque = new MyDeque<Character>();
		System.out.println("Offering First 'P'");
		deque.offerFirst('P');
		System.out.println("Offering Last 'L'");
		deque.offerLast('L');
		System.out.println("Offering First 'P'");
		deque.offerFirst('P');
		System.out.println("Offering Last 'E'");
		deque.offerLast('E');
		System.out.println("Offering First 'A'");
		deque.offerFirst('A');
		
		System.out.println("Size Check: The current size of the deque is " + deque.size());
		if(deque.isEmpty()){
			System.out.println("The deque is empty. Something must be wrong. :(");
		}
		else{
			System.out.println("The deque is NOT empty as expected. :)");
		}
		
		System.out.println("Printing Items for Iterator Testing....");
		deque.print(); // MyDeque class has Iterator and uses it to implement print() method
		
		try{
			System.out.println("Poll Last: Expecting '" + deque.peekLast() + "' to be Removed.");
			System.out.println("The Removed Value is '" + deque.pollLast() + "'");
			System.out.println("Poll First: Expecting '" + deque.peekFirst() + "' to be Removed.");
			System.out.println("The Removed Value is '" + deque.pollFirst() + "'");
			System.out.println("Poll Last: Expecting '"+ deque.peekLast() + "' to be Removed.");
			System.out.println("The Removed Value is '" + deque.pollLast() + "'");
			System.out.println("Poll First: Expecting '"+ deque.peekFirst() +"' to be Removed.");
			System.out.println("The Removed Value is '" + deque.pollFirst() + "'");
			System.out.println("Poll Last: Expecting '"+ deque.peekLast() +"' to be Removed.");
			System.out.println("The Removed Value is '" + deque.pollLast() + "'");
			System.out.println("Poll First: Expecting Error Case since deque must be empty now.");
			System.out.println("The Removed Value is '" + deque.pollFirst() + "'");
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		try{
			System.out.println("Peek Last: Expecting Error Case since deque must be empty now.");
			System.out.println("The Removed Value is '" + deque.peekLast() + "'");
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Size Check: The current size of the deque is " + deque.size());
		if(deque.isEmpty()){
			System.out.println("The deque is empty as expected. :)");
		}
		else{
			System.out.println("The deque is NOT empty. Something must be wrong. :(");
		}
		
		
		System.out.println("Testing what if I use Iterator for Empty Deque...");
		System.out.println("Expeciting No Output on display");
		deque.print();
		
		
		System.out.println("Exhaustive Testing is Complete.");
		System.out.println("The Program Ends....");
		
		System.exit(0);
	}
}