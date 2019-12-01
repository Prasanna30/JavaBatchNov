package CollectionsPrograms;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
	    
	       
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");
		    
		System.out.println("Elements in Deque:"+dq);
		dq.addFirst("Rani");
		dq.addLast("Raja");
		
		System.out.println("Elements in Deque:"+dq);
	       
		System.out.println("Removed element: "+dq.removeLast());
		    
		System.out.println("Elements in Deque:"+dq);
		System.out.println("Head: "+dq.element());
		    
		
		System.out.println("poll(): "+dq.pollLast());
		    
		
		System.out.println("peek(): "+dq.peek());
		System.out.println("peek(): "+dq.peekLast());
		
	
		System.out.println("Elements in Deque:"+dq);

	}

}
