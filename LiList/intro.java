
/*
node: it is represent the each node in the linked list
:= it contains data to store  teh value  and next to the "pointer to the next node"

linked list class:
1.manage the linl list 
2.contain "head" ti store  the pointet pf thr first node
3. [rovide methods yto insert nodes tje dbegs. and the end to display the list.

display method
display() print  all  the elementr tof the linked list
 * 
 */

package LiList;

import java.util.LinkedList;

public class intro {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        LinkedList<String> s=new LinkedList<>();

        ll.add(1);
        ll.add(44);
        ll.add(4);
        ll.push(8);
        ll.add(22);
       // ll.toString("kkk");
        System.out.println(ll);

        s.add("Uttpal");
        s.add("Vikash");
        s.add("Vaibhav");
        s.push("Pandey");
        s.addFirst("Vinay");
        s.add("dnull");
        ll.remove(1);
        ll.addAll(ll);
        System.out.println(s);
        s.peek();// it return the head value or null !
      //  System.out.println(s.descendingIterator());
  
    }
}
