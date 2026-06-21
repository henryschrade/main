import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        String word = SelectWord.getWordFromFile().toUpperCase();
        Scanner userInput = new Scanner(System.in);
        String b = "[ ][ ][ ][ ][ ] \n";
        String board = b.repeat(6);
        int attempts = 0;
        String guess1 = "";
        String guessl = "";
        String wordl = "";
        String[] words = {"", "", "", "", "", ""};
        System.out.println("Welcome to Wordle!");
        int att = 6;
        String guess = "";
        boolean correct; 
         System.out.println(board);
        System.out.println("Guess the 5-letter word in 6 Guesses. You have " + att + " attempts remaining.");
           while(guess.equals(word) != true && att >= 1){ 
            while (!SelectWord.isValidWord(guess)){
            System.out.println("Please enter a valid 5 letter word.");
            guess = userInput.nextLine().toUpperCase();
            }  
        System.out.println("\n\n\n\n\n\n\n\n\n");
          words[6-att] = guess;   
          for(int a = 0; a <= 6-att; a++){
           guess = words[a]; 
           for(int i = 1; i <= 5; i++){
              guessl = guess.substring(i-1,i);
              wordl = word.substring(i-1,i);
              if(guessl.equals(wordl)){
                System.out.print("[");
                printWithColor.print(guessl,"green");
                System.out.print("]");
              } else if(word.indexOf(guessl) != -1){
                  System.out.print("[");
                  printWithColor.print(guessl,"yellow");
                  System.out.print("]");
              } else {
                System.out.print("[");
                System.out.print(guessl);
                System.out.print("]");
              }
            }
          System.out.println(""); 
              }  
            board = ""; 
            att--; 
            board += b.repeat(att);
            System.out.println(board);
            if (guess.equals(word)){
              correct = true;
               System.out.println("You guessed the word in " + (6-att) + " guesses! The word was " + word);
                break;
            }
            System.out.println(guess + " was not the word. You have " + att + " guesses remaining."); 
            if (att == 0){
              System.out.println("You ran out of guesses. The word was " + word + ".");
            }
            guess = "";
        }       
    }
}
