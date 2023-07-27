import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day4__HW__arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1.Write a Java program to test if the first and the last
        // element of an array of integers are same.
        // The length of the array must be greater than or equal to 2

//        int[] nums = {20,34,6,76,6786,3,20};
//        int lastIndex = nums[nums.length-1];
//        if (nums[0] == lastIndex){
//            System.out.println(true);
//        }else System.out.println(false);
//


        // 2.Write a Java program to find the k largest elements in a given array.
        // Elements in the array can be in any order.

//        int[] nums = {0, 26, 21, 1, 15, 30, 3, 5, 22};
//        int k;
//        do{
//            System.out.printf("please enter k value : ");
//            k = input.nextInt();
//        }while (k >= nums.length);
//        int[] largestNums = new int[k];
//        int rep;
//        System.out.println(Arrays.toString(nums));
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    rep = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = rep;
//                }
//                rep = 0;
//            }
//        }
//        for (int i = 0; i < largestNums.length; i++) {
//            largestNums[i] = nums[i];
//        }
//        System.out.println( "the lagrest "+ k + " number is : " + Arrays.toString(largestNums));


        // 3.Write a Java program to find the numbers greater than the average of the numbers of a given array.

//        int[] nums = {0, 26, 21, 1, 15, 30, 3, 5, 22,53,75,100};
//        ArrayList upAvg = new ArrayList();
//        int total = 0;
//        double avg ;
//        for (int i = 0; i < nums.length; i++) {
//            total +=nums[i];
//        }
//        avg = total / nums.length;
//
//        for (int elm: nums) {
//            if(elm > avg){
//                upAvg.add(elm);
//            }
//        }
//        System.out.println("The average of the said array is: " + avg + " The numbers in the said array that are greater than the " +
//                "average are: " + upAvg);


        // 4.Write a Java program to get the larger value between first and last element of an array of integers.

//        int[] nums = {30, 40, 60};
//        int firstIndex = nums[0];
//        int lastIndex = nums[nums.length - 1];
//        if (firstIndex < lastIndex) {
//            System.out.println("Larger value between first and last element is : " + lastIndex);
//        } else if (firstIndex > lastIndex) {
//            System.out.println("Larger value between first and last element is : " + firstIndex);
//        } else System.out.println("the first and the last elment are EQUALS ");
//

        // 5.Write a Java program to swap the first and last elements of an array and create a new array.

//        int[] nums = {30, 40, 60};
//        int firstIndex = nums[0];
//        int lastIndex = nums[nums.length - 1];
//        int temp;
//
//        System.out.println(Arrays.toString(nums));
//        nums[0] = lastIndex;
//        nums[nums.length - 1] = firstIndex;
//        System.out.println(Arrays.toString(nums));


        // 6.Write a Java program to find all of the longest word in a given dictionary.

        // احسب الطول حق اطول كلمة في اللوب الاولى
        // ثم في اللوب الثانيه قارن اي كلمه تساوي بالطول اطول كلمه تضيفها للاراي ليست
//        String[] str = {"hh", "cat", "bl", "kkk", "ui", "rgb"};
//        ArrayList longestArr = new ArrayList();
//        int longWordLength = str[0].length();
//        System.out.println(longWordLength);
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].length() > longWordLength) {
//                longWordLength = str[i].length();
//            }
//        }
//
//        for (String elm : str
//        ) {
//            if (elm.length() == longWordLength) {
//                longestArr.add(elm);
//            }
//        }
//
//        System.out.println("the longest word in this array : " + Arrays.toString(str));
//        System.out.println("is : " + longestArr);


        // 7.Write a menu driven Java program with following option:

        // 1- Accept elements of an array
        //
        // 2- Display elements of an array
        //
        // 3- Search the element within array
        //
        // 4- Sort the array
        //
        // 5- To Stop

//        System.out.printf("please enter the length of array : ");
//        int length = input.nextInt();
//        boolean isPlaying = true;
//
//        int[] elments = new int[length];
//
//        do {
//            System.out.println("please enter number for services. " +
//                    "1- for enter array values. " +
//                    "2- Display elements of an array. " +
//                    "3- Search the element within array" +
//                    "4- Sort the array. " +
//                    "5- to stop app");
//            int options = input.nextInt();
//
//            switch (options) {
//                case 1: {
//                    for (int i = 0; i < length; i++) {
//                        System.out.printf("please enter the value of " + i + " index :");
//                        int elm = input.nextInt();
//                        elments[i] = elm;
//                    }
//
//                    break;
//                }
//                case 2: {
//                    System.out.println("this is your array : " + Arrays.toString(elments));
//                    break;
//                }
//                case 3: {
//                    System.out.printf("please enter the value to search : ");
//                    int src = input.nextInt();
//                    boolean isHere = false;
//
//                    for (int i = 0; i < length; i++) {
//                        if (elments[i] == src) {
//
//                            System.out.println("yes there's " + src + " in the array");
//                            isHere = true;
//                            break;
//                        }
//                    }
//                    if (!isHere) {
//                        System.out.println("sorry the number not avaliable in this array");
//                    }
//                    break;
//                }
//                case 4: {
//                    int rep;
//                    for (int i = 1; i < elments.length; i++) {
//                        for (int j = 0; j < i; j++) {
//                            if (elments[i] < elments[j]) {
//                                rep = elments[j];
//                                elments[j] = elments[i];
//                                elments[i] = rep;
//                            }
//                            rep = 0;
//                        }
//                    }
//                    System.out.println(Arrays.toString(elments));
//                    break;
//                }
//                case 5: {
//                    isPlaying = false;
//                    break;
//                }
//
//            }
//        } while (isPlaying);
//        System.out.println("thank you");


        // 8. Write a program thats displays the number of occurrences of an element in the array.

//        int[] nums = {3, 3, 3, 5, 5, 1, 1, 50};
//        System.out.printf("please enter the number you want to search about it : ");
//        int src = input.nextInt();
//        int count = 0;
//
//        for (int elm : nums
//        ) {
//            if (elm == src) count++;
//        }
//
//        System.out.println(src + " is occurs " + count + " times");


        // 10. Write a program that test the equality of two arrays.

//        int[] firstArr = {5, 6, 7, 8, 9, 10};
//        int[] secondArr = {5, 4, 7, 8, 9, 10};
//        boolean isEqual = true;
//        for (int i = 0; i < firstArr.length; i++) {
//            if (firstArr[i] != secondArr[i]) {
//                isEqual = false;
//                break;
//            }
//        }
//
//        System.out.println("are the two arrays Equal ? " + isEqual);

    }
}
