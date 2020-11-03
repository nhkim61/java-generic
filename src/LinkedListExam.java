import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;

class LinkedListExam {
    public static void main(String[] args) {
	System.out.println("LinkedListExam");
	List<Integer> myIntList = new LinkedList<>();
	myIntList.add(Integer.valueOf(0));
	Integer x = myIntList.iterator().next();
	System.out.println(x);

	List<String> ls = new ArrayList<String>();

	Collection<String> c = new ArrayList<String>();
	c.add("111");
	printCollection(c);

	Object[] oa = new Object[10];
	Collection<Object> co = new ArrayList<Object>();
	//fromArrayToCollection(oa,co);
	//printCollection(co);

	String[] sa = new String[10];
	Collection<String> cs = new ArrayList<String>();
	//fromArrayToCollection(sa,cs);
	//fromArrayToCollection(sa,co);
	
	//printCollection(co);

	Integer[] ia = new Integer[10];
	Float[] fa = new Float[10];
	Number[] na = new Number[10];

	Collection<Number> cn = new ArrayList<Number>();
	fromArrayToCollection(na, co);
	printCollection(co);
	
    }
    static void printCollection(Collection<?> c) {
	for(Object e : c) {
	    System.out.println(e);
	}
    }
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	for(T o:a){
	    c.add(o);
	}
    }
}
