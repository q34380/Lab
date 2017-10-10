

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedListTest {
public static void main(String[] args) {
	LinkedList<String> a=new LinkedList<String>();
	a.addFirst("Tulsa");
	a.add("Ada");
	a.add("Broken Arrow");
	a.addLast("Owasso");
	a.add(2,"OKC");
	LinkedList<String> s=new LinkedList<String>();
	s.addFirst("74104");
	s.add("74135");
	s.add("foo");
	s.add("Hello World");
	s.addLast("777");
	LinkedList<String> merge = new LinkedList<String>();
	merge.addAll(a);
	merge.addAll(s);
	
	
	LinkedList<String> copy = new LinkedList<String>();
	
	ListIterator<String> sIer=s.listIterator();
    
	while(a!=null){
    	copy.add(sIer.next());
    			}
	
	
	
}
}
