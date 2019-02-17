import java.util.Arrays;

class ArraysCalculator {

    static int[] sum(int[] numbers, int n) {

        int[] sum;
        int size;

        if (numbers == null) throw new NullPointerException();

        if (numbers.length < n) throw new ArrayIndexOutOfBoundsException();

        if (numbers.length % n == 0) {
            size = numbers.length / n;
            sum = new int[size];
            for (int i = 0; i < sum.length; i++)
                sum[i] = Arrays.stream(numbers, n * i, (n * i) + n).sum(); //liczy sumę liczb z danego zakresu indeksow

        } else {
            size = numbers.length / n;
            sum = new int[size + 1];

            int difference = numbers.length - size; //liczymy o ile powiększyć wejściową tablicę, żeby spełnić warunek size % n = 0
            int[] numbers1 = Arrays.copyOf(numbers, numbers.length + difference); //do wejściowej tabllicy doklejamy odpowiednia liczbę zer

            for (int i = 0; i < sum.length; i++)
                sum[i] = Arrays.stream(numbers1, n * i, (n * i) + n).sum();
        }

        return sum;

    }
}