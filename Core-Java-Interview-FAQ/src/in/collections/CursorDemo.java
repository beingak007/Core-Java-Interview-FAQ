package in.collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class CursorDemo
{
    public static void main(String arg[])
    {
        Vector vtr=new Vector();
        Enumeration enm=v.elements();
        Iterator itr=vtr.iterator();
        ListIterator ltr=vtr.listIterator();
        System.out.println(enm.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}
