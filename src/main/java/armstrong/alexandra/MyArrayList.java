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
        add(item, counter);
    }

    public void add(T item, int index){
        if(isFull()){
            increaseSize();
        }
        if(index < counter) {
            for (int i = counter; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[index] = item;
        counter++;
    }

    public void increaseSize(){
        T[] tempArr = (T[])  new Object [counter * 2];
        for(int i = 0; i < counter; i++){
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    public T get(int index){
        return arr[index];
    }

    public void remove(int index){
        for(int i = index; i < counter; i++){
            arr[i] = arr[i + 1];
        }
        arr[counter] = null;
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
        if (counter > 0){
            return false;
        } else {
            return true;
        }
    }

    public boolean isFull(){
        if(counter == arr.length){
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(T item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == (item)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(T item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T item){
        for(int i = arr.length; i >= 0; i--){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public <T> T[] toArray(){
        T[] answer = (T[]) new Object[counter];
        for(int i = 0; i < counter; i++){
            answer[i] = (T) arr[i];
        }
        return answer;
    }
}

