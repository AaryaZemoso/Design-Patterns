package IteratorDemo;

class IteratorDS{
    public static void main(String args[])
    {
        SList<Integer> list = new SList<>();
        SListIterator<Integer> itr = list.iterator();

        itr.add(1);
        itr.add(2);
        itr.add(3);

        System.out.println(list);

        itr.reset();
        System.out.println(itr.next());

        itr.remove();

        System.out.println(list);

    }
}