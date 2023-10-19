import java.util.Scanner;
/* Programmer: Will Coyne
    Date: October 10 2023
    Description: This program takes words from the user
    and puts them in lower and upper case, scrambles them, puts words in the middle of 
    words where you want, and puts words in between the word by the letter.
*/
public class Runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask user for a word
        System.out.println("Type a word:");
        String originalWord = input.nextLine();
        System.out.println();
        //create a WordGame Object using user's word as parameter
        WordGames firstWord = new WordGames(originalWord);
        //print the WordGame Object 
        System.out.println("Original word is: " + firstWord.toString());
        System.out.println();
        //whisper it and print
        firstWord.setText(originalWord);
        System.out.println("Whisper: ");
        System.out.print(firstWord.whisper());
        System.out.println();
        //yell it and print
        System.out.println("Yell: ");
        System.out.print(firstWord.yell());
        System.out.println();
        // Scramble it and print
        System.out.println("Scrambled Word: " + firstWord.scramble());
        System.out.println();
        // Ask for an index (integer)
        System.out.println("Enter an integer(index): ");
        int index = input.nextInt();
        input.nextLine(); //this is used to skip over the new line  - this is a Java input issue (EX: input.nextLine();)

        // Ask for random word which will be inserted into the original word
        System.out.println("Enter a random word: ");
        String newWord = input.nextLine();
        System.out.println();
        //bananaSplit the original word with the new word at specified index and print
        System.out.println("Word Split 1: " + firstWord.bananaSplit(index, newWord));
        //print a blank line
        System.out.println();
        //prompt for another word
        System.out.println("Enter a new word: ");
        String secondWord = input.nextLine();
        System.out.println();
        //set WordGame variable to the new word
        //WordGames word2 = new WordGames(secondWord);
        firstWord.setText(secondWord);
        //print the updated WordGame object
        System.out.println("New word is: " + firstWord.toString());
        System.out.println();
        // Ask for a single letter from the new word (store as a String)
        System.out.println("Enter a single letter from the new word: ");
        String letter = input.nextLine();
        System.out.println();
        //Ask for another word which will be inserted into the new word
        System.out.println("Enter a new word: ");
        String word3 = input.nextLine();
        System.out.println();
         //bananaSplit the new word with the last word at specified letter and print
        System.out.println("Word Split 2: " + firstWord.bananaSplit(letter, word3));
        
        
    }
}