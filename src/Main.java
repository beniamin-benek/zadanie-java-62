import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        try {
            int[] numbers = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("1: " + Arrays.toString(ArraysCalculator.sum(numbers,3)));
            System.out.println("2: " + Arrays.toString(ArraysCalculator.sum(numbers,2)));
            System.out.println("3: " + Arrays.toString(ArraysCalculator.sum(numbers,4)));
            System.out.println("4: " + Arrays.toString(ArraysCalculator.sum(numbers,12)));
            System.out.println("5: " + Arrays.toString(ArraysCalculator.sum(null,1)));
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

    }

}