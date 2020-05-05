package linkedListAlgorithm;

public class DualDirectionLinkedList<T> {
	public ListNode<T> head;
	public ListNode<T> tail;
	private int size;

	public DualDirectionLinkedList() {
		size = 0;
		this.head = null;
		this.tail = null;
	}

	public void insertNode( T item) {
		ListNode<T> node = new ListNode<T>();
		node.item = item;
		node.next = null;

		if (head == null) {
			head = node;
			tail = node;
			tail.next = null;
			tail.prev = null;
			size = 1;
		} else {
			ListNode<T> prev = tail;
			tail.next = node;
			tail = node;
			tail.prev = prev;
			size++;
		}
	}

	public void insertFirst(T item) {
		ListNode<T> node = new ListNode<T>();
		node.item = item;
		node.next = head;
		head.prev = node;
		head = node;
		size++;
	}

	public void insertNth(T item, int position) {
		int center = (int) Math.floor(size / 2);
		ListNode<T> node = new ListNode<T>();
		node.item = item;
		ListNode<T> current = null;
		if (head != null && position <= size) {
			if (position < center) {
				current = head;
				for (int i = 1; i < position; i++) {
					current = current.next;
				}
			} else {
				current = tail;
				for (int i = size; i > position; i--) {
					current = current.prev;
				}
			}
			node.next = current.next;
			current.next.prev = node;
			node.prev = current;
			current.next = node;
			size += 1;
		} else {
			System.out.println("Exceeded the linked list size" + size);
		}
	}
	
	public void deleteFirstNode() {
		if (head != null) {
			head = head.next;
			head.prev = null;
			size--;
		} else {
			System.out.println("Linked list is empty");
		}
	}

	public void deleteLastNode() {
		
		if(head.next==null) {
			head= null;
			tail=null;
			size--;
			System.out.println("Empyt LinkedList");
		}else if(tail !=null) {
			tail =tail.prev;
			tail.next=null;
			size--;
		}
		
		
	}

	public void deleteNthNode(int position) {
		ListNode<T> current = null;
		int center = (int) Math.floor(size / 2);
		if (position < size) {
			if (position < center) {
				current = head;
				for (int i = 1; i < position; i++) {
					current = current.next;
				}
			} else {
				current = tail;
				for (int i = size - 1; i > position; i--) {
					current = current.prev;
				}
			}
			current.prev.next = current.next;
			current.next.prev = current.prev;
			size--;
		} else {
			System.out.println("The position exceeds : " + this.size);
		}
	}

	public void findNode(T item) {
		ListNode<T> node = this.head;
		boolean found = false;
		for (int i = 0; i < size; i++) {
			if (node.item.equals(item)) {
				System.out.println( item + " was found at location " + i + " in the linked list");
				found = true;
			}
			node = node.next;
		}

		if (!found)
			System.out.println( item + " was not found");
	}

	public void findNodeAt(int location) {
		ListNode<T> node = this.head;
		if (head != null && location <= size) {
			for (int i = 0; i < location; i++) {
				node = node.next;
			}
			System.out.println(location + " is " + node.item);
		}
	}

	public void findLastNode() {
		if (tail != null) {
			System.out.println( tail.item);
		}
	}
	
	public int getSize() {
		System.out.println(size);
		return size;
	}
	
	
	public void printDualDirectionList() {
		if(size<1) {
			System.out.println("no elements in the array");
		}else {
			ListNode<T> current=head;
			while (current != null) 
			{
				current.listele(); 
				current = current.next; 
			}
			System.out.println("");
						
		}
	}
	

	
}
