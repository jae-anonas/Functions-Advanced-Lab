package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

//1. Write a function that takes in a number and returns true if the number is even or false if the number is odd. You may
// use control flow and multiple conditionals.
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

//2. Write a function that takes in two words and compares them. If the spelling is the same, the functions returns true,
//  otherwise false.
    static boolean hasSameSpelling (String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

//3. Write a function that takes in a word and prints out its every letter on a new line before it sees the letter "w".
// If it encounters "w" the function should stop executing.
    static void printWordDownwardsUntilW(String str){
        for (char a : str.toCharArray()) {
            if (a == 'w' || a == 'W')
                break;
            System.out.println(a);
        }
        System.out.println();
    }

//4. Write a function that generates a random number. Print it out. If the number is greater that 50, return it, otherwise
//  return -1. You may use control flow and multiple conditionals.
    static int generateRandomNumber(){
        int randomNum = (int) (Math.random() * 100) + 1; //random number range 1 - 100;
        System.out.println("Random number generated: " + randomNum);
        return (randomNum > 50) ? randomNum : -1;
    }

//5. Write a function that takes in 3 integers: day, month, and year and computes day, month, and year of the next day.
// The function should return a string (e.g. day:12 month:11 year:1988)
    static String getNextDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            return "Date is invalid";
        }

        day += 1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 32) {
                    day = 1;
                    month += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 31) {
                    day = 1;
                    month += 1;
                }
                break;
            case 2:
                if (year % 4 == 0 && day == 30){
                    day = 1;
                    month += 1;
                }
                else if (year % 4 != 0 && day == 29){
                    day = 1;
                    month += 1;
                }
                break;
            case 12:
                if (day == 32){
                    day = 1;
                    month = 1;
                    year += 1;
                }
                break;
        }

        //case if month has 31 days and original day is 31


        return "day:" + day + " month:" + month + " year:" + year;
    }

//6. Write a function that takes in a word, omits every other letter in that word and returns a new word. You can use
//  control flow and multiple conditionals.
    static String omitEveryOtherChar(String str){
        String newWord = "";
        for (int i = 0; i < str.length(); i += 2) {
            newWord += str.charAt(i) + " ";
        }
        return newWord;
    }

//7. Write a function that takes in a number greater than 5 and prints out all the numbers from 1 to that number except
// number 4. Please use a while statement.
    static void printNumbersExceptFour(int num) {
        if (num <= 5){
            System.out.println("Number is not greater than 5.");
            return;
        }
        int i = 1;
        while(i <= num) {
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i++);
        }
    }

//8. Write a function that takes in 2 numbers, and checks if they are the same. If they are not the same, it adds 1 to
// every number and returns its sum. If the numbers are the same, it adds 2 to every number and returns its sum.
    static int getCustomSum(int num1, int num2) {
        return (num1 == num2) ? num1 + num2 + 4: num1 + num2 + 2;
    }

//9. Write a function that asks the user to enter a country domain. If the user types in "us", the function prints out
// "United States", if the user enters "de", the function prints out "Germany", if the user types in "hu" the response
// should be "Hungary". In all other cases the function should print out "Unknown". Please try to use a switch statement
// and make sure the function works with a user's input of lower and upper case strings.
    static void getCountry(String cd) {
        //get user input
        switch (cd.toLowerCase()){
            case "us":
                System.out.println("United States");
                break;
            case "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
        }
    }
    static void getCountryFromInput() {
        //get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country domain: ");
        String cd = sc.nextLine();

        switch (cd.toLowerCase()){
            case "us":
                System.out.println("United States");
                break;
            case "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
        }
    }

//10. Write a function that asks the user to type in a letter and prints out whether the letter is a vowel or a consonant.
//    You may use control flow and multiple conditionals.
    static void getTypeOfLetter (char letter) {
        if(Character.isLetter(letter)) {
            letter = Character.toLowerCase(letter);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Character is a vowel.");
                    break;
                default:
                    System.out.println("Character is a consonant.");

            }
        }
        else {
            System.out.println("Character is not a letter.");
        }
    }

    static void getTypeOfLetterFromInput () {
        //get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str = sc.nextLine();
        char letter = str.charAt(0);
        if(Character.isLetter(letter)) {
            letter = Character.toLowerCase(letter);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Character is a vowel.");
                    break;
                default:
                    System.out.println("Character is a consonant.");

            }
        }
        else {
            System.out.println("Character is not a letter.");
        }
    }


    public static void main(String[] args) {

        System.out.println("  Testing functions");
        System.out.println("---------------------");

        // Testing functions
        // 1. isEven
        System.out.println("Is 2 even? " + isEven(2));
        System.out.println("Is 99 even? " + isEven(99));
        System.out.println("\n---------------------");

        // 2. hasSameSpelling
        System.out.println("Does \"mango\" and \"manga\" have the same spelling? " + hasSameSpelling("mango", "manga"));
        System.out.println("Does \"Android\" and \"android\" have the same spelling? " + hasSameSpelling("Android", "android"));
        System.out.println("\n---------------------");

        // 3. printWordDownwardsUntilW
        System.out.println("printWordDownwardsUntilW(\"Ross Geller\"): ");
        printWordDownwardsUntilW("Ross Geller");
        System.out.println("printWordDownwardsUntilW(\"David Schwimmer\"): ");
        printWordDownwardsUntilW("David Schwimmer");
        System.out.println("\n---------------------");

        // 4. generateRandomNumber
        System.out.println("Returned value: " + generateRandomNumber());
        System.out.println("Returned value: " + generateRandomNumber());
        System.out.println("Returned value: " + generateRandomNumber());
        System.out.println("\n---------------------");


        // 5. getNextDate
        System.out.println("Next day from 28 Feb 2000 (leap year) = " + getNextDate(28, 2, 2000));
        System.out.println("Next day from 25 Mar 2005 = " + getNextDate(25, 3, 2005));
        System.out.println("Next day from 31 Dec 1999 = " + getNextDate(31, 12, 1999));
        System.out.println("Next day from 28 Feb 1951 (not a leap year) = " + getNextDate(28, 2, 1951));
        System.out.println("Next day from 31 Aug 1989 = " + getNextDate(31, 8, 1989));
        System.out.println("Next day from 30 Feb 1989 = " + getNextDate(30, 2, 1989));
        System.out.println("\n---------------------");


        // 6. omitEveryOtherChar
        System.out.println("omitEveryOtherChar(\"abcdefghijklmnopqrstuvwxyz\")");
        System.out.println(omitEveryOtherChar("abcdefghijklmnopqrstuvwxyz"));
        System.out.println("omitEveryOtherChar(\"JxAxEx xAxNxOxNxAxS\")");
        System.out.println(omitEveryOtherChar("JxAxEx xAxNxOxNxAxS"));
        System.out.println("omitEveryOtherChar(\"R.i.c.h.a.r.d. .D.a.w.k.i.n.s\")");
        System.out.println(omitEveryOtherChar("R.i.c.h.a.r.d. .D.a.w.k.i.n.s"));
        System.out.println("\n---------------------");


        // 7. printNumbersExceptFour
        System.out.println("printNumbersExceptFour(10):");
        printNumbersExceptFour(10);
        System.out.println("printNumbersExceptFour(5):");
        printNumbersExceptFour(5);
        System.out.println("\n---------------------");


        // 8. getCustomSum
        System.out.println("getCustomSum(5, 4) = " + getCustomSum(5, 4));
        System.out.println("getCustomSum(25, 25) = " + getCustomSum(5, 5));
        System.out.println("\n---------------------");


        // 9. getCountry
        System.out.print("getCountry(\"us\") = ");
        getCountry("us");
        System.out.print("getCountry(\"De\") = ");
        getCountry("De");
        System.out.print("getCountry(\"HU\") = ");
        getCountry("HU");
        System.out.print("getCountry(\"Eu\") = ");
        getCountry("Eu");
        System.out.println("\n---------------------");


        // 10. getTypeOfLetter
        System.out.print("getTypeOfLetter(\'m\') = ");
        getTypeOfLetter('m');
        System.out.print("getTypeOfLetter(\'A\') = ");
        getTypeOfLetter('A');
        System.out.print("getTypeOfLetter(\'n\') = ");
        getTypeOfLetter('n');
        System.out.print("getTypeOfLetter(\'%\') = ");
        getTypeOfLetter('%');
        System.out.println("\n---------------------");


        // 9 and 10 from input
        String input = "";
        String choice = "";

        do {
            System.out.println("\n\nTesting options: \n1 - Country Domain\n2 - Vowel or Consonant\n3 - Q (to quit)");
            System.out.print("Enter choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();
            if (choice.equals("1")) {
                getCountryFromInput();
            }
            else if (choice.equals("2")) {
                getTypeOfLetterFromInput();
            }
            else if (choice.equals("q")) {
                System.out.println("Ending program....");
            }
            else {
                System.out.println("Unrecognized choice.");
            }

        } while(!choice.equals("q"));
    }


}
