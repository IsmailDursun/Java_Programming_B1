package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        if(number%3==0&&number%5==0){
            System.out.println("FizzBuzz");
        }else if(number%3==0) {
            System.out.println("Fizz");
        }else if(number%5==0) {
            System.out.println("Buzz");
        }else{
            System.out.println("Just a number");
        }
//
//    /*
//
//       you will have a number
//
//       if the number is divisible by 3 print -> Fizz
//       if the number is divisible by 5 print -> Buzz
//       if the number is divisible by both 3 and 5 -> FizzBuzz
//       if the number is not divisible by any of those, print just the number
//
//     */
//
//
//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter a number");
//                int n = input.nextInt();
//
//                if(n % 3 == 0 && n % 5 == 0) {  // n % 15 == 0
//                    System.out.println("FizzBuzz");
//                } else  if(n % 3 == 0){
//                    System.out.println("Fizz");
//                } else if(n % 5 == 0){
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(n);
//                }


            }

        }


