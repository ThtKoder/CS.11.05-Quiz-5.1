import java.util.Arrays;

public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
        int[] returnValue = new int[array1.length+array2.length];
        for(int i = 0; i < array1.length; i++){
            returnValue[i] = array1[i];
        }
        for(int j = 0; j < array2.length; j++){
            returnValue[j+array1.length] = array2[j];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(returnValue));
        return returnValue;
    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] returnValue = new int[array1.length+array2.length];
        int firstArray = 0;
        int secondArray = 0;
        //variable stores where the pointer is for each array

        for(int i = 0; i < returnValue.length; i++){
            //first go to the first array
            if(i == 0 || i%2 == 0){
                returnValue[i] = array1[firstArray];
                firstArray++;
            }
            //then draw form the second array
            if(i%2 != 0) {
                returnValue[i] = array2[secondArray];
                secondArray++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(returnValue));
        return returnValue;
    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {
        int[] product = Arrays.copyOf(array1, array1.length);
        for(int i = 0; i < product.length; i++){
            product[i] = array1[i]*array2[i];
        }
        System.out.println(Arrays.toString(product));
        return product;
    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        //cycle through the entire length of the array,
        //and for each word cacluate the number of arrays


        int[] capitalCounting = new int[words.length];
        //need to calculate the number of the words
        for(int i = 0; i < capitalCounting.length; i++){
            countCapitalLetters(Arrays.toString(words).substring(0,words.length));
            //needed to do the substring of the actual word so
            //you can get the number of capital letters per each 'word'
            //in each string[]
        }

        System.out.println(words.length);

        return capitalCounting[];
    }

    public static int countCapitalLetters(String word) {
    int capitalNumbers = 0;
        for(int i = 0; i < word.indexOf(" "); i++){
            if ((int) word.charAt(i) <= 65 && (int) word.charAt(i) >= 90) {
                capitalNumbers++;
            }
        }

        return 5;
    }

}
