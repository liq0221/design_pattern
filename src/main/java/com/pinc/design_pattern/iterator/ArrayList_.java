package com.pinc.design_pattern.iterator;

public class ArrayList_<E> implements Collection_<E>{

    E[] objs = (E[])new Object[10];

    private int index = 0;

    @Override
    public void add(E e) {
        if (index == objs.length) {
            E[] newObjs = (E[])new Object[objs.length * 2];
            System.arraycopy(objs,0,newObjs,0,objs.length);
            objs = newObjs;
        }
        objs[index++] = e;
    }
    @Override
    public int size() {
        return size();
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrayListIterator_();
    }


    private class ArrayListIterator_ implements Iterator_<E> {

        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            return objs[currentIndex++];
        }
    }
}
