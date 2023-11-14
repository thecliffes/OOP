
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by QueueElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */


import java.util.NoSuchElementException;

public class Queue<T> {

	private QueueElement<T> head;
	private QueueElement<T> tail;

	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty () {
		return ((head == null) && (tail == null));
	}
	
	
	/**
	 * Returns the element at the head of the queue
	 */
	public T peek () throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException("NoSuchElement error");
		} else {
			return head.getElement();
		}
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException {
	    if(isEmpty()) {
	    	throw new NoSuchElementException("NoSuchElement error");
	    }
	    head = head.getNext();
	    if(head == null) {
	    	tail = null;
	    }
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (T element) {
		QueueElement<T> newNode = new QueueElement<T>(element, tail);
		if(isEmpty()) {
			newNode.setNext(null);
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(null);
			tail.setNext(newNode);
		}
		tail = newNode;
    }
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {
		QueueElement<T> t;
		  if (!isEmpty())
		{
		  for (t = head; t != null; t = t.getNext())
		{

		  System.out.println(t.getElement());
		   }
		 }
		}
	}

