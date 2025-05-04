public class MyArrayList<T> {
    static final int INITIAL_CAPACITY = 4;
    T arr[];
    public MyArrayList() {
    arr = (T[]) new Object[INITIAL_CAPACITY];
    }
    boolean add(T value) {
    if (arr.length == size()) {
    Object temp[] = (T[]) new Object[arr.length * 2];
    for (int i = 0; i < arr.length; i++) {
    temp[i] = arr[i];
    }
    arr = (T[]) temp;
    }
    arr[size()] = value;
    return true;
    }
    T get(int index) {
    
    if (index < arr.length && index >= 0) {
    return (T) arr[index];
    }
    return null;
    }
   int size() {
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
    if (arr[c] != null) {
    c++;
    }
    }
    return c;
    }
   public String toString() {
    
    int i;
    String str = " [";
    for (i = 0; i < size() - 1; i++) {
    str = str + arr[i] + ',';
    }
    str = str + arr[i];
    return str + "]";
    }
   boolean contains(T value) {
    
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == value) {
    return true;
    }
    }
    return false;
    }
   
   MyArrayList duplicate(){
       MyArrayList c=new MyArrayList();
       for (int i = 0; i <size(); i++) {
           c.add(arr[i]);
       }
       return c;
   }
    MyArrayList merge(MyArrayList arr1,MyArrayList arr2){
      MyArrayList arr3=new MyArrayList();
       for (int i = 0; i < arr1.size(); i++) {
    if( !arr3.contains(arr1.get(i))){
    arr3.add(arr1.get(i));
    }
    }
    for (int i = 0; i < arr2.size(); i++) {
    if( !arr3.contains(arr2.get(i))){
    arr3.add(arr2.get(i));
    }
    }
   
       return arr3;
   }
    
   }
   