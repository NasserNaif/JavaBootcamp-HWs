import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class day3__HW__loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1.Write a program that prints the numbers from 1 to 100 such that:
//        for (int i = 1 ; i <= 100 ; i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }else {
//                System.out.println(i);
//            }
//        }

        // 2.Write a Java program to reverse a string.
//        String str = "The quick brown fox",rev ="";
//        char latter ;
//
//        for (int i = 0; i < str.length(); i++) {
//            latter = str.charAt(i);
//            rev = latter + rev;
//        }
//
//        System.out.println("the reverse of ( " +str+" ) is : " + rev);


        // 3.Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.
//        while (true){
//            System.out.printf("plaese enter a positive number here : ");
//            int num = input.nextInt();
//            if(num > 0){
//                for (int i = 1; i <= 12; i++) {
//                    System.out.println(num + " x " + i + " = " + (num * i));
//                }
//                break;
//            }
//
//        }


        // 4.Write a program to find the factorial value of any number entered through the keyboard.
//        int total = 1 ;
//        System.out.printf("plaese enter a positive number here : ");
//        int num = input.nextInt();
//        for (int i = 1 ; i <=num; i++){
//            total *= i;
//        }
//        System.out.println("the factorial number of " + num + " is : " + total);


        // 5.Two numbers are entered through the keyboard. Write a program
        // to find the value of one number raised to the power of another.
        // (Do not use Java built-in method)
//        System.out.printf("plaese enter a number here : ");
//        int num = input.nextInt();
//        System.out.printf("plaese enter a power value: ");
//        int pow = input.nextInt();
//        int total = 1;
//        for(int i = 1 ; i <= pow ; i++){
//            if(pow < 0 ){
//                System.out.println("enter a positive number in power value");
//                break;
//            }else {
//
//                total *= num;
//            }
//        }
//        System.out.println("the result of ( " + num + " power of " + pow + " ) is : " + total);



        // 6.Write a program that reads a set of integers,
        // and then prints the sum of the even and odd integers.
//        int sumEven = 0 ;
//        int sumOdd = 0 ;
//        for (int i = 1 ; i <= 100 ; i++){
//            if(i % 2 == 0){
//                sumEven +=i;
//            }else sumOdd +=i;
//        }
//
//        System.out.println("the total sum of all Even number between 1 - 100 is : " + sumEven);
//        System.out.println("the total sum of all Odd number between 1 - 100 is : " + sumOdd);


        // 7.Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.

//        System.out.printf("plaese enter a number: ");
//        int num = input.nextInt();
//        boolean isPrime = true ;
//        if(num <= 1 ){
//            System.out.println("please enter number greater than 1 ");
//            return;
//        }
//        for (int i = 2; i <= num/2; i++) {
//
//                if((num % i) == 0){
//                    System.out.println(num + " isn't prime number");
//                    isPrime = false;
//                    break;
//                }
//        }
//        if (isPrime){
//            System.out.println(num + " is prime number ");
//        }



        // 8.Write a program to enter the numbers till the user wants
        // and at the end it should display the count of positive, negative and zeros entered.

//        int positiveNums = 0;
//        int negitiveNums = 0;
//        int zeros = 0;
//        boolean isFinish = false;
//
//        while (!isFinish){
//
//            System.out.println("enter any key to play");
//            String m = input.nextLine();
//            System.out.println("enter any key to continue OR enter 'E' to end this program : " );
//            String endLoop = input.nextLine();
//            if(endLoop.equalsIgnoreCase("e")){
//                isFinish = true;
//                break;
//            }
//            System.out.println("plaese enter a number: ");
//            int num = input.nextInt();
//            if(num > 0)positiveNums++;
//            else if(num < 0)negitiveNums++;
//            else zeros++;
//        }
//        System.out.println("you have entered " + positiveNums + " positive numbers!");
//        System.out.println("you have entered " + negitiveNums + " negitive numbers!");
//        System.out.println("you have entered " + zeros + " zero numbers!");


        // 9.Use a for loop to print headings for four weeks (Weeks 1 - 4).
        // Then use another for loop to print the days (Days 1 -7) for each week.

//        for (int i = 1; i <=4 ; i++) {
//            System.out.println("week " +i);
//            for (int j = 1; j <=7 ; j++) {
//                System.out.println("day " + j);
//            }
//            System.out.println();
//        }


        // 10.Write a program thats check if the word is a
        // palindrome or not. hint: A string is said to be
        // a palindrome if it is the same if we start
        // reading it from left to right or right to left.

        System.out.printf("please enter a string : ");
        String str = input.nextLine();

        String rev ="";
        char latter ;

        for (int i = 0; i < str.length(); i++) {
            latter = str.charAt(i);
            rev = latter + rev;
        }

        if(rev.equalsIgnoreCase(str)){
            System.out.println("word ( " + str + " ) is a palindrome word");
        }else System.out.println("word ( " + str + " ) isn't a palindrome word");
    }
}