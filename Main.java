import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Q - 1 : 1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number.
        If the number is a multiple of 5, you need to print "Buzz" instead of that
        number.
        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        instead of that number.


        int i ;
        for(i =1;i<=100;i++){
            if(i % 3 == 0){
                System.out.println("Fizz");
                continue;
            }else if(i % 5 == 0){
                System.out.println("Buzz");
                continue;
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
        }*/
/*

        Q - 2 : 2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String word = scanner.nextLine();


        for (int i = word.length()-1 ; i <= word.length(); i--) {
            String reverse_word = word.charAt(i) + "";
            if(i == word.length()-1){
                System.out.println("Reverse string : ");

            }
            System.out.print(reverse_word);
            if (i <= 0){
                break;
            }
    }


*/




        /*
        Q - 3 : 3.Write a program to find the factorial value of any number entered
        through the keyboard.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);*/

        /*
        Q - 4 :4.Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java
        built-in method)

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number1 = scanner.nextInt();
        System.out.println("enter the power : ");
        int power = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= power; i++) {
            res = res * number1;
        }
        System.out.println("the result = "+res);
*/

        /*
        Q - 5 : 5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers.

        int number;
        int evenTotal = 0;
        int oddTotal = 0;
        do {
            System.out.println("Please enter number or 0 for terminate... ");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            if(number%2==0){
                evenTotal = evenTotal+number;
            }else{
                oddTotal = oddTotal+number;

            }

        } while (number !=0);

        System.out.println("Even Total : "+evenTotal);
        System.out.println("Odd Total : "+oddTotal);*/
/*

        Q - 6 :6.Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime number. 
        
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
           System.out.println("Please enter a positive number or -1 for out : ");
           num = scanner.nextInt();
            if(num % 2 !=0 && num % 3 !=0 ) {
                System.out.println("Prime number");
            }else if(num == 2 || num == 3){
                System.out.println("Prime number");
            }else{
                System.out.println("Not Prime number");
            }
        }while(num != -1);

*/
        /*Q - 7 : 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        another for loop to print the days (Days 1 -7) for each week.

        int week ;
        int day;
        for (week = 1; week < 5; week++) {
            System.out.println("Week "+week);
            for (day = 1; day < 8; day++) {

                System.out.println("Day"+day);
            }
        }*/


/*
        Q - 8 :
        8.Write a program thats check if the word is a palindrome or not. hint: A
        string is said to be a palindrome if it is the same if we start reading it from
        left to right or right to left.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String word = scanner.nextLine();


        int first_index = 0;
        int last_index = word.length() - 1;

        while (first_index < last_index) {
            if (word.charAt(first_index) != word.charAt(last_index)) {
                System.out.println("the word is not a palindrome");
                break;
            }else{
                System.out.println("the word is a palindrome");
                first_index ++;
                last_index --;

            }

        }*/



}}
