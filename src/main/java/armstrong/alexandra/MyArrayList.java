package armstrong.alexandra;

import java.lang.reflect.Array;

public class MyArrayList<T> {
    private T contains;
    private T[] arr;
    private int counter;

    public MyArrayList(){
        arr = (T[]) new Object[10];
    }

    public MyArrayList(int size){
        arr = (T[]) new Object[size];
    }

    public int length(){
        return counter;
    }

    public void add(T item){}

    public void add(T item, int index){}

    public T get(int index){
        return null;
    }

    public void remove(int index){}

    public void set(T item, int index){}

    public void clear(){}

    public boolean isEmpty(){
        return false;
    }

    public boolean isFull(){
        return false;
    }

    public boolean contains(T item){
        return false;
    }

}

