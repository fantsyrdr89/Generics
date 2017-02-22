package armstrong.alexandra;

public class MyArrayList<T> {
    private T contains;
    private T[] arr;
    private int counter = 0;

    public MyArrayList(){
        arr = (T[]) new Object[10];
    }

    public MyArrayList(int size){
        arr = (T[]) new Object[size];
    }

    public int length(){
        return counter;
    }

    public void add(T item){
        if(isFull()){
            increaseSize();
        }
        arr[counter] = item;
        counter++;
    }

    public void add(T item, int index){
        if(isFull()){
            increaseSize();
        }
        for(int i = counter; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = item;
        counter++;
    }

    public void increaseSize(){
        T[] tempArr = (T[])  new Object [counter * 2];
        arr = tempArr;
    }

    public T get(int index){
        return arr[index];
    }

    public void remove(int index){
        for(int i = index; i < counter; i++){
            arr[i] = arr[i + 1];
        }
        counter--;
    }

    public void set(T item, int index){
        if(index >= counter){
            counter++;
        }
        arr[index] = item;
    }

    public void clear(){
        arr = (T[]) new Object[10];
        counter = 0;
    }

    public boolean isEmpty(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                return false;
            }
        }
        return true;
    }

    public boolean isFull(){
        if(counter == arr.length){
            return true;
        }
        return false;
    }

    public boolean contains(T item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == (item)){
                return true;
            }
        }
        return false;
    }

}

