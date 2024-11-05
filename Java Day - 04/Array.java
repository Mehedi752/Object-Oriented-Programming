import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class myClass {
    void show() {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }
        scanner.close();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum of the Array: " + sum);

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        // int[] descArr = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // descArr[i] = arr[arr.length - 1 - i];
        // }

        // int descArr[] = Arrays.stream(arr)
        // .boxed()
        // .sorted((a, b) -> b - a)
        // .mapToInt(Integer::intValue)
        // .toArray();

        Integer descArr[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(descArr, Collections.reverseOrder());

        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(descArr));
    }
}

public class Array {

    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.show();
    }
}
