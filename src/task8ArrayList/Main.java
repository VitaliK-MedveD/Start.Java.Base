package task8ArrayList;

import task8ArrayList.myArrayList.MyArrayList;
import task8ArrayList.myArrayList.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> numbers = new MyArrayList<>();
        MyList<Integer> numbers2 = new MyArrayList<>(15);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println("numbers: " + numbers + " Size: " + numbers.size());
        numbers.add(2, 10);
        System.out.println("numbers: " + numbers + " Size: " + numbers.size());
        numbers.add(9);
        numbers.add(10);
        System.out.println("numbers: " + numbers + " Size: " + numbers.size());
        System.out.println("Индекс: " + numbers.indexOf(10));
        numbers2.add(11);
        numbers2.add(12);
        numbers2.add(13);
        numbers2.add(14);
        numbers2.add(13);
        numbers2.add(12);
        numbers2.add(11);
        numbers2.add(10);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(7);
        System.out.println("numbers2: " + numbers2 + " Size: " + numbers2.size());
        numbers.addAll(numbers2);
        System.out.println("numbers: " + numbers + " Size: " + numbers.size());
        MyList<Integer> nums = new MyArrayList<>(numbers2);
        System.out.println("nums: " + nums + " Size: " + nums.size());
        nums.add(125);
        nums.add(2, 33);
        System.out.println("nums: " + nums + " Size: " + nums.size());
    }
}
