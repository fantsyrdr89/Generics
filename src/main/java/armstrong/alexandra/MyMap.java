package armstrong.alexandra;
import armstrong.alexandra.Tuple.*;

public class MyMap<A,B>{
    private MySet<A> key;
    private MyArrayList<B> value;
    private int counter = 0;
    //public A key;
    //public B value;

    /*class Tuple<A,B>{
        public A key;
        public B value;
        public Tuple(A a, B b){
            key = a;
            value = b;
        }
    }*/ //cast to the make it work pile for later

    public MyMap(){
        key = new MySet<A>();
        value = new MyArrayList<B>();
    }

    public int length(){
        return counter;
    }

    public void add(A a, B b){
        if(!containsKey(a)) {
            key.set(a, counter);
            value.set(b, counter);
            counter++;
        }
    }

    /*private void increaseSize(){
        Tuple<A, B>[] tempArr = (Tuple<A,B>[]) new Object [counter * 2];
        for(int i = 0; i < counter; i++){
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }*/

    public B getValue(A a){
        for(int i = 0; i < counter; i++){
            if (key.get(i) == a){
                return value.get(i);
            }
        }
        return null;
    }

    private int getIndex(A a){
        for(int i = 0; i < counter; i++){
            if (key.get(i) == a){
                return i;
            }
        }
        return -1;
    }

    public void remove(A a){
        if(getIndex(a) > -1) {
            if(getIndex(a) == counter - 1){
                counter--;
            } else {
                counter--;
                for (int i = getIndex(a); i < counter; i++) {
                    key.set(key.get(i + 1), i);
                    value.set(value.get(i + 1), i);
                }
            }
        }
    }

    public void setValue(A a, B b){
        if(containsKey(a)){
            value.set(b, getIndex(a));
        } else {
            add(a, b);
            counter++;
        }
    }

    public void clear(){
        key = new MySet<A>();
        value = new MyArrayList<B>();
        counter = 0;
    }

    public boolean isEmpty(){
        if(counter > 0){
            return false;
        } else {
            return true;
        }
    }

    public boolean containsKey(A a){
        for(int i = 0; i < counter; i++){
            if (key.get(i) == a){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(B b){
        for(int i = 0; i < counter; i++){
            if (value.get(i) == b){
                return true;
            }
        }
        return false;
    }

    public A[] keySet(){
        A[] answer = (A[]) new Object[counter];
        for(int i = 0; i < counter; i++){
            answer[i] = key.get(i);
        }
        return answer;
    }

    public B[] valueList(){
        B[] answer = (B[]) new Object[counter];
        for(int i = 0; i < counter; i++){
            answer[i] = value.get(i);
        }
        return answer;
    }
}



