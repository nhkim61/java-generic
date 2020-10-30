import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;

class LinkedListExam {
    public static void main(String[] args) {
	System.out.println("LinkedListExam");
	List<Integer> myIntList = new LinkedList<>();
	myIntList.add(new Integer(0));
	Integer x = myIntList.iterator().next();
	System.out.println(x);

	List<String> ls = new ArrayList<String>();

	Collection<?> c = new ArrayList<String>();
	//c.add("111");
    }
    void printCollection(Collection<?> c) {
	for(Object e : c) {
	    System.out.println(e);
	}
    }
}
