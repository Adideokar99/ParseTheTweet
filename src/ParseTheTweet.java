/*
* NetPay.java
* Author: Aditya Deokar
* Submission Date: 09/06/2017
*
* Purpose: This program takes an input of hours per week worked by an employee from the user to output the employee's net pay, gross pay, 
* and deductions.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner keyboard = new Scanner(System.in);
      String tweet;
      String typ;
      String det;
      String loc;
      String lat;
      String lng;
      int start;
      int finish;
      
      System.out.println("Enter a tweet.");
      tweet = keyboard.nextLine();
      
      start = tweet.indexOf("#");
      finish = tweet.indexOf(";");
      typ = tweet.substring(start + 4, finish).trim().toUpperCase();
      System.out.println(tweet);
      tweet = tweet.substring(finish + 1);
    
      start = tweet.indexOf("#");
      finish = tweet.indexOf(";");
      det = tweet.substring(start + 4, finish).trim().replace("," , "-");
      tweet = tweet.substring(finish + 1);
      
      start = tweet.indexOf("#");
      finish = tweet.indexOf(";");
      loc = tweet.substring(start + 4, finish).trim().replace("," , "-");
      tweet = tweet.substring(finish + 1);
      
      start = tweet.indexOf("#");
      finish = tweet.indexOf(";");
      lat = tweet.substring(start + 4, finish).trim();
      tweet = tweet.substring(finish + 1);
      
      start = tweet.indexOf("#");
      finish = tweet.indexOf(";");
      lng = tweet.substring(start + 4, finish).trim();
      tweet = tweet.substring(finish + 1);
      
      System.out.println();

      System.out.println("Type: \t\t" + typ);
      System.out.println("Detail: \t" + det);
      System.out.println("Location: \t" + loc);
      System.out.println("Latitude: \t" + lat);
      System.out.println("Longitude: \t" + lng);
	}
}
