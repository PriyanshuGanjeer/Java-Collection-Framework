

// Iterator can iterate on Forward Directions

import java.util.*;
public class Iterator1
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println("------Printing elements using Iterator------");
        Iterator<Integer> rf=list.iterator();
        while(rf.hasNext()){
            System.out.println(rf.next());
        }
        
    }
}
