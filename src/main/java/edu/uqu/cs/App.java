package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters(){
  for(int i=1;i<=20;i++){
   
  if(i%2==0|| i%4==0|| i%6==0)
  {

    if(i%2==0){
        System.out.print("tweetle");
    }

    if(i%4==0){
        System.out.print("Beetle");
    }

    if(i%6==0){
        System.out.print("Poodle");
    }


  }else{
    System.out.print(i);
  }

     System.out.print(" ");

  }
 
}
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
    public static void phoneKeypad(String str)
    {
        String output="";
         for(int i=0;i<str.length();i++){
           char c= str.toUpperCase().charAt(i);
           switch(c){
           case'A':
           case'B':
           case'C':
           output+='2';
           break;
           case'D':
           case'E':
           case'F':
           output+='3';
           break;
           case'G':
           case'H':
           case'I':
           output+='4';
           break;
           case'J':
           case'K':
           case'L':
           output+='5';
           break;
           case'M':
           case'N':
           case'O':
           output+='6';
           break;
           case'P':
           case'Q':
           case'R':
           case'S':
           output+='7';
           break;
           case'T':
           case'U':
           case'V':
           output+='8';
           break;
           case'W':
           case'X':
           case'Y':
           case'z':
           output+='9';
           break;
         }
          
        }
       System.out.print(output);
    }
   
    public static void main(String [] args) {
        

        /* Write your code here */
     
       //call method twisters()


       twisters();


       //prompt user to enter a string
       
       
       Scanner in = new Scanner(System.in);

       //call method phoneKeypad(string)

       String str = in.nextLine();
       phoneKeypad(str);



    }

}
