package armstrong.alexandra;

public class MyMap<A,B>{
    private Tuple<A,B>[] arr;
    private int counter;
    public A key;
    public B value;

    class Tuple<A,B>{
        public A key;
        public B value;
        public Tuple(A a, B b){
            key = a;
            value = b;
        }
    }

    public MyMap(){
        arr = (Tuple[]) new Object[10];
    }

    public MyMap(int size){
        arr = (Tuple[]) new Object[size];
    }

    public int length(){
        return counter;
    }

    public void add(A a, B b){

    }

    public B getValue(A a){
        return null;
    }

    public void remove(A a){}

    public void setValue(A a, B b){}

    public void clear(){}

    public boolean isEmpty(){
        return false;
    }

    public boolean isFull(){
        return false;
    }

    public boolean containsKey(A a){
        return false;
    }

    public boolean containsValue(B b){
        return false;
    }

    public A[] keySet(){
        return null;
    }

    public B[] valueList(){
        return null;
    }


}
