import java.util.Arrays;
import java.util.Random;

/**
 * Class: InsertionSort
 * Version: 0.1
 * <p>
 * Created by: Georgii Rozhnev, https://github.com/grozhnev
 * Date: 2017-09-25
 * <p>
 * Description:
 *      Algorithm of insertion sort,
 *          a) regular/straight (ascending)
 *          b) reverse (descending)
 */
public class InsertionSort {
    int[] numbers;

    private void start(){
        /*instantiate random array*/
        this.numbers = new int[new Random().nextInt(100)];
        System.out.println("We create an array of " + numbers.length + " elements:");

        /*filling array with randomly generated content*/
        for (int i = 0; i < this.numbers.length; i++) {
            numbers[i] = new Random().nextInt(800);
        }
        System.out.println(Arrays.toString(numbers));

        /*straight sort*/
        regularInsertionSort();
        System.out.println("\nWe make insertion sort:");
        System.out.println(Arrays.toString(numbers));

        /*reverse insertion sort*/
        reverseInsertionSort();
        System.out.println("\nWe made reverse insertion sort:");
        System.out.println(Arrays.toString(numbers));
    }

    private void regularInsertionSort(){
        int valueToInsert;
        int position;

        for (int j = 1; j < numbers.length ; j++) {
            valueToInsert = numbers[j];
            position = j;

            while (position > 0 && numbers[position-1]>valueToInsert){
                numbers[position] = numbers[position-1];
                position--;
            }
            numbers[position] = valueToInsert;
        }
    }

    private void reverseInsertionSort(){
        int valueToInsert;
        int position;

        for (int i = numbers.length-2; i >= 0 ; i--) {
            valueToInsert = numbers[i];
            position = i;

            while (position < numbers.length-1 && numbers[position+1]>valueToInsert){
                numbers[position]=numbers[position+1];
                position++;
            }
            numbers[position]=valueToInsert;
        }
    }

    public static void main(String[] args) {
        InsertionSort sorting = new InsertionSort();
        sorting.start();
    }
}