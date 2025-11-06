//Практика: реализовать класс UniqueList, не допускающий дубликатов.


import java.util.HashSet;
import java.util.Set;

public class Main26 {
    private Set<T> set;

    public UniqueList() {
        set = new HashSet<>();
    }

    public boolean add(T element) {
        return set.add(element); 
    }

    public boolean remove(T element) {
        return set.remove(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public int size() {
        return set.size();
    }

    public void printList() {
        System.out.println(set);
    }

    public static void main(String[] args) {
        UniqueList<Integer> uniqueList = new UniqueList<>();

        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(3);

        uniqueList.printList();
    }
}