package AdapterDemo;

import java.util.Enumeration;

import IteratorDemo.SList;
import IteratorDemo.SListIterator;

class SListEnumerationAdapter implements Enumeration{

    SListIterator itr;

    SListEnumerationAdapter(SListIterator itr) {
        this.itr = itr;
    }

    @Override
    public boolean hasMoreElements() {
        return itr.hasNext();
    }

    @Override
    public Object nextElement() {
        return itr.next();
    }

    public static void main(String[] args) {

        SList<Integer> list = new SList<>();
        SListIterator<Integer> itr = list.iterator();

        SListEnumerationAdapter enumAdapter = new SListEnumerationAdapter(itr);

        itr.add(1);
        itr.add(2);
        itr.add(3);

        itr.reset();

        System.out.println(enumAdapter.hasMoreElements());
        System.out.println((SList.SNode)enumAdapter.nextElement());
        System.out.println((SList.SNode)enumAdapter.nextElement());

    }
}