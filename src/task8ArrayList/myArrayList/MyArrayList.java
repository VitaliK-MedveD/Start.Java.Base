package task8ArrayList.myArrayList;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T>{

    private final int DEFOALT_CAPACITY = 10;
    private Object[] mainArray;
    private int size;

    private void upCapasity(Object[] oldArray) {
        int newCapasity = (int) (oldArray.length * 1.5 + 1);
        mainArray = Arrays.copyOf(oldArray, newCapasity);
    }

    private void upCapasity(Object[] oldArray, int range) {
        mainArray = Arrays.copyOf(oldArray, oldArray.length + range);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(mainArray[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        if (size == mainArray.length){
            upCapasity(mainArray);
            mainArray[size] = value;
            size++;
        } else {
            mainArray[size] = value;
            size++;
        }
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        if (0 <= index && index < size) {
            if (size == mainArray.length) {
                upCapasity(mainArray);
                Object[] sum = new Object[mainArray.length];
                System.arraycopy(mainArray, 0, sum, 0, index);
                sum[index] = value;
                System.arraycopy(mainArray, index, sum, index + 1, mainArray.length - (index + 1));
                mainArray = Arrays.copyOf(sum, mainArray.length);
                size++;
            } else {
                Object[] sum = new Object[mainArray.length];
                System.arraycopy(mainArray, 0, sum, 0, index);
                sum[index] = value;
                System.arraycopy(mainArray, index, sum, index + 1, mainArray.length - (index + 1));
                mainArray = Arrays.copyOf(sum, mainArray.length);
                size++;
            }
            return true;
        } else {
            System.out.println("Индекс больше колличества заполненных ячеек, или отрицательный");
            return false;
        }
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        if (value.size() > (mainArray.length - size)) {
            upCapasity(mainArray, value.size() - (mainArray.length - size));
            for (int i = 0; i < value.size(); i++) {
                mainArray[size] = value.get(i);
                size++;
            }
        } else {
            for (int i = 0; i < value.size(); i++) {
                mainArray[size] = value.get(i);
                size++;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(mainArray[i])) {
                Object[] sum = new Object[mainArray.length];
                System.arraycopy(mainArray, 0, sum, 0, i);
                System.arraycopy(mainArray, i + 1, sum, i, mainArray.length - (i + 1));
                mainArray = Arrays.copyOf(sum, mainArray.length);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (0 <= index && index < size) {
            Object[] sum = new Object[mainArray.length];
            T delete = (T) mainArray[index];
            System.arraycopy(mainArray, 0, sum, 0, index);
            System.arraycopy(mainArray, index + 1, sum, index, mainArray.length - (index + 1));
            mainArray = Arrays.copyOf(sum, mainArray.length);
            size--;
            return delete;
        } else {
            System.out.println("Индекс больше колличества заполненных ячеек, или отрицательный");
            return null;
        }
    }

    @Override
    public T get(int index) {
        if (0 <= index && index < size) {
            return (T) mainArray[index];
        }
        System.out.println("Индекс больше колличества заполненных ячеек, или отрицательный");
        return null;
    }

    @Override
    public T set(int index, T value) {
        if (0 <= index && index < size) {
            T oldVaue = (T) mainArray[index];
            mainArray[index] = value;
            return oldVaue;
        }
        System.out.println("Индекс больше колличества заполненных ячеек, или отрицательный");
        return null;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(mainArray[i])) {
                return i;
            }
        }
        return -1;
    }

    public MyArrayList() {
        this.mainArray = new Object[DEFOALT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.mainArray = new Object[capacity];
    }

    public MyArrayList(MyList<? extends T> col) {
        this.mainArray = new Object[DEFOALT_CAPACITY];
        if (col.size() > DEFOALT_CAPACITY) {
            upCapasity(mainArray, col.size() - DEFOALT_CAPACITY);
            for (int i = 0; i < col.size(); i++) {
                mainArray[i] = col.get(i);
                size++;
            }
        } else {
            for (int i = 0; i < col.size(); i++) {
                mainArray[i] = col.get(i);
                size++;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(mainArray, size));
    }
}
