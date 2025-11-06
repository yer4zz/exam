//Практика: реализовать адаптер, превращающий данные массива в список.


import java.util.ArrayList;
import java.util.List;

class ArrayToListAdapter {
    public List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}

public class Main15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        ArrayToListAdapter adapter = new ArrayToListAdapter();
        List<Integer> list = adapter.convertArrayToList(array);

        System.out.println(list); 
    }
}
