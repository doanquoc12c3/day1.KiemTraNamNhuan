package com.codegym;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of interest");
        int year = scanner.nextInt();
        if( year % 4 == 0 && year % 400==0){
            System.out.println("This is a leap year");
        } else{
            System.out.println("This is not a leap year");
        }
    }
}
