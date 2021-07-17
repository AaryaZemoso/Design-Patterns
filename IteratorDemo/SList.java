package IteratorDemo;

public class SList<T> {

    public static class SNode<T> {
        T data;
        SNode<T> next;

        SNode(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "SNode{" +
                    data +
                    '}';
        }
    }

    ;

    SNode<T> head;

    public SListIterator<T> iterator() {
        return new SListIterator<T>(this);
    }

    public String toString() {
        SListIterator<T> itr = iterator();
        String makeString = "[ ";
        while (itr.hasNext())
            makeString += itr.next() + " , ";
        makeString = makeString.substring(0, makeString.length() - 2) + " ]";
        return makeString;
    }
}
