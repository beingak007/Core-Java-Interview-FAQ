import java.util.*;

class LinkedListDemo
{
    public static void main(String arg[])
    {
        LinkedList l=new LinkedList();
        l.add("Durga");
        l.add(30);
        l.add(null);
        l.add("Durga");
        System.out.println(l);
        l.set(0,"software");
        System.out.println(l);
        l.add(0,"venky");
        System.out.println(l);
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);
    }
}