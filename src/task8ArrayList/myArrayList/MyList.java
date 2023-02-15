package task8ArrayList.myArrayList;

public interface MyList<T> {



    int size();

    boolean isEmpty();

    boolean contains(Object value);

    boolean add(T value);

    boolean add(int index, T value);

    boolean remove(Object value);

    boolean addAll(MyList<? extends T> value); // добавляет элементы одной коллекции в конец другой.

    T get (int index); // возвращает объект из списка по индексу index

    T remove (int index); // удаляет элемент по индексу index, возвращает при этом удалённый объект.

    T set (int index, T value); // присваивает значение объекта value элементу, который находиться по индексу index.

    int indexOf (Object value); // возвращает индекс первого вхождения объекта value в список. Если объект не найден вернуть -1;
}
