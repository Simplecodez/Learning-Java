package generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    private T[] list = (T[]) new Object[2];
    private int count;

    public void add(T item){
        list[count++] = item;
    }

    public T get(int index){
        return list[index];
    }

    @Override
    public Iterator<T> iterator() {
        var r = new ListIterator(this);
        return new ListIterator(this);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }

    public void sort(Comparator<T> comparator){
        Arrays.sort(list, comparator);
    }

    private class ListIterator implements Iterator<T> {

        private GenericList<T> lists;
        private int index;

        public ListIterator(GenericList<T> list){
            this.lists = list;
        }

        @Override
        public boolean hasNext() {
           return this.index< lists.count;
        }

        @Override
        public T next() {
            return this.lists.get(index++);
        }
    }
}
