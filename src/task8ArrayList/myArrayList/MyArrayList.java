package task8ArrayList.myArrayList;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T>{

    private final int DEFOALT_CAPACITY = 10;
    private int capacity;
    private T[] mainArray;
    private int size;

    public MyArrayList() {
        capacity = DEFOALT_CAPACITY;
        this.mainArray = new T[DEFOALT_CAPACITY];
    }

    public MyArrayList(int count) {
        capacity = count;
        mainArray = new T[capacity];
    }

    //public static void sysSumArrays(String[] first, String[] second) {
    //    String[] sum = new String[(first.length + second.length)];
    //    System.arraycopy(first, 0, sum, 0, first.length);
    //    System.arraycopy(second, 0, sum, first.length, second.length);
    //    System.out.println(("Сумма диагоналей sys:" + "\n" + Arrays.toString(sum) + "\n"));
    //}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public boolean add(T value) {
        return false;
    }

    @Override
    public boolean add(int index, T value) {
        return false;
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T set(int index, T value) {
        return null;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }
}
