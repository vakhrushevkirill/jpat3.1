import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return min != max;
            }

            @Override
            public Integer next() {
                int newMin = random.nextInt(max + 1 - min) + min;
                return newMin;
            }
        };
    }
}