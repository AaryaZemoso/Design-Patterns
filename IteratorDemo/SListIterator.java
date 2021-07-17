package IteratorDemo;

public class SListIterator<T> {
    SList<T> list;
    SList.SNode<T> curr;

    SListIterator(SList<T> list) {
        this.list = list;
        this.curr = this.list.head;
    }

    public void add(T data) {
        SList.SNode<T> temp = new SList.SNode<>(data);

        if (curr == null)
            this.list.head = this.curr = temp;

        else {
            temp.next = this.curr.next;
            this.curr.next = temp;

            this.curr = this.curr.next;
        }

    }

    public void remove() {
        if (this.list.head == this.curr) {
            this.list.head = this.curr = this.list.head.next;
            return;
        }

        if (this.list.head.next == null) {
            this.list.head = this.curr = null;
            return;
        }

        if (this.list.head == null)
            return;

        if (this.curr == null)
            return;

        SList.SNode<T> temp = this.list.head;
        while (temp.next != this.curr)
            temp = temp.next;

        temp.next = this.curr.next;
        this.curr = temp;
    }

    public void reset() {
        this.curr = this.list.head;
    }

    public boolean hasNext() {
        return curr != null;
    }

    public SList.SNode<T> next() {

        SList.SNode<T> temp = this.curr;
        this.curr = this.curr.next;
        return temp;
    }

}
