
/*
Features Of ArrayList
● ArrayList  is dynamic Array. We can store different data type like int , float , String , Char , etc in once ArrayList.


● public ArrayList()
Constructs an empty list with an initial capacity of ten.


●ArrayList Size increased 50% by its original value
Just suppose ArrayList initial capacity is 10 . If we want to add more then 10 member /data its size increased 50% of 10 . = 5 . Now new size of ArrayList is 15.

*/
import java.util.*;
public class ArrayListDemo
{
    public static void main(String[] args) {
        System.out.println("\n ArrayList In Java");
ArrayList a = new ArrayList(); // old non-generic arraylist  
a.add(1);
a.add("Hello");
a.add(1.3);
a.add("c");
System.out.println("\n\nThe element in ArrayList are"+" "+a);
a.set(2,"World"); // Replace 1.3 with World

System.out.println("\n\nAfter set 2nd index of ArrayList "+" "+a);
a.remove(1);
System.out.println("\n\nAfter removing 1st index elements ArrayList are"+" "+a);
System.out.println("\n\nSize of ArraysList"+" "+ a.size());

// Now We declare Generic ArrayList

ArrayList<Integer> i = new ArrayList<Integer>();
i.add(3);
i.add(8);
i.add(6);
i.add(1);
i.add(4);
i.add(9);
i.add(5);
System.out.println("\n\n The Elements in generic Integer Type Of ArrayList Are "+" "+i);
Collections.sort(i); // This will sort array elements in ascending order
System.out.println("\n\n After Using sort method .Sorted ArrayList Are"+" "+i);

ArrayList<String> s = new ArrayList<String>();
s.add("Hindi");
s.add("Physics");
s.add("Chemistry");
s.add("Maths");
s.add("English");
System.out.println("\n\nString Type ArrayList"+" "+s);
Collections.sort(s);//It Will Sort String Array In Alphabetical order Like A<B<C<D.......<Z
System.out.println("\n\n After Performing Sorting Operation in String ."+" "+s);

    }
}
