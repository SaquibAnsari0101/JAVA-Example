import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        //Array :

        //Declaration :

        //type[] name = new type[size];
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 3;
        numbers[2] = 1;
        numbers[3] = 5;
        numbers[4] = 2;
        //or

        //type[] name = {elements with coma separated};
        int[] serialNumbers = {9,5,3,7,8,2,1};

        //Methods :

        //Print :

        System.out.println(serialNumbers + "<- This is the address of the array"); // this will print the address of array
        System.out.println("\nElements of the array : " + Arrays.toString(serialNumbers)); // remember to add Arrays.toString(serialNumbers) to get the values printed!

        //Sort : sorting the array
        Arrays.sort(serialNumbers);
        System.out.println("\nSorted array : " + Arrays.toString(serialNumbers));

        //Length :
        System.out.println("\nLength : " + numbers.length);
    }
}
/*
Output:

    [I@2d98a335<- This is the address of the array

    Elements of the array : [9, 5, 3, 7, 8, 2, 1]

    Sorted array : [1, 2, 3, 5, 7, 8, 9]

    Length : 5

*/