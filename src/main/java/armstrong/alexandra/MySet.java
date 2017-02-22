package armstrong.alexandra;

public class MySet<T> extends MyArrayList<T>{
    private T contains;
    private int counter;
    private T[] arr;

    public MySet(){
        arr = (T[]) new Object[10];
    }

    public MySet(int size){
        arr = (T[]) new Object[size];
    }

    @Override
    public void add(T item){

    }

    @Override
    public void add(T item, int index){

    }

    @Override
    public void set(T item, int index){

    }

}
