import java.util.Scanner;
import java.io.*;

public class palindrome {
    public static void main(String args[]){
        // input a string
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a word: ");
        String _word = scan.next();
        System.out.println("word is " + _word);
        // read through each char in string in both direction
        // loop through the characters in the string
        for (int i=0; i<_word.length(); i++) {

            System.out.println(_word.charAt(i));
        }
        // compare each char in both direction
        // stop at mid-point
        //compare while traversing
        //if they are the same while comparing, then its a palindrome
        //print that it's a palindrome



    }
}
