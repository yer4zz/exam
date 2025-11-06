//Практика: Реализовать итератор чисел Фибоначчи


import java.util.Iterator;

class FibonachiIterator implements Iterator<Integer> {
    int prev = 0;
    int cur = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextVal = prev;
        int temp = cur;
        cur += prev;
        prev = temp;
        return nextVal;
    }
}

public class Main10 {
    public static void main(String[] args) {
        Iterator<Integer> fibonachiIterator = new FibonachiIterator();

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonachiIterator.next());
        }
    }
}
