// hasNext indexing start at -1
// using ListIterator we can iterator element in both forward and backward direction
import java.util.*; 
public class ListIterator1 { 
    public static void main(String[] args) { 
        LinkedList<String>myList = new LinkedList<String>(); 
        myList.add("Electrical");
        myList.add("Mechanical");
        myList.add("Civil"); 
        myList.add("Computer science"); 
        myList.add("Information Technology"); 
        myList.add("Mining"); 
        ListIterator<String> rf = myList.listIterator(); 
        System.out.println("Elements in the LinkedList:");
        while(rf.hasNext()) 
        System.out.print(rf.next() + " "); 
        System.out.println("--------------------------------------------");
        List<Integer> i=new ArrayList<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        i.add(6);
        ListIterator ref=i.listIterator();
        while(ref.hasNext()){
            System.out.println(""+ref.next()+ "");
        }
        System.out.println("------------printing element using backward iteration --------------- ");
        while(ref.hasPrevious()){
            System.out.println(ref.previous());
        }
         
} }