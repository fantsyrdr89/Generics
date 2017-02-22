package armstrong.alexandra;

public class MyMap<A,B>{
    private MySet<A> key;
    private MyArrayList<B> value;
    private int counter = 0;

    public MyMap(){
        key = new MySet<>();
        value = new MyArrayList<>();
    }

    public int length(){
        return counter;
    }

    public void add(A a, B b){
        if(!containsKey(a)) {
            key.add(a);
            value.add(b);
            counter++;
        }
    }

    public B getValue(A a){
        for(int i = 0; i < counter; i++){
            if (key.get(i) == a){
                return value.get(i);
            }
        }
        return null;
    }

    public void remove(A a){
        if(key.indexOf(a) > -1) {
            value.remove(key.indexOf(a));
            key.remove(key.indexOf(a));
            counter--;
        }
    }

    public void setValue(A a, B b){
        if(containsKey(a)){
            value.set(b, key.indexOf(a));
        } else {
            add(a, b);
            counter++;
        }//can delete else, better practice?
    }

    public void clear(){
        key = new MySet<>();
        value = new MyArrayList<>();
        counter = 0;
    }

    public boolean isEmpty(){
        return key.isEmpty();
    }

    public boolean containsKey(A a){
        return key.contains(a);
    }

    public boolean containsValue(B b){
        return value.contains(b);
    }

    public <A> A[] keySet(){
        return key.toArray();
    }

    public <B> B[] valueList(){
        return value.toArray();
    }
}



