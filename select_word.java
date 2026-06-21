import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
public class SelectWord{
    public static String getWordFromFile(){
      String selectedWord = "hello";
      int num1 = (int)(Math.random() * 1000);
      int count = 0;
      //This loop runs twice for your conviencence 
      for(int x = 0; x < 2; x++){
        
      
            try {  
                  Scanner fileScanner = new Scanner(new File("ValidScrabbleWords.txt"));
                    //this file has atleast 100 five-letter words
                  while (fileScanner.hasNextLine()) {
                    
                      String word = fileScanner.nextLine();
                      count++;
                      if (count == num1){
                        return word;
                      }
                    
                  }
                fileScanner.close();
              } catch (FileNotFoundException e) {
                  System.err.println("Word list file not found: ");
              }
      }
      return selectedWord;
    }

    public static boolean isValidWord(String guess){
        try {  
            Scanner fileScanner = new Scanner(new File("ValidScrabbleWords.txt"));
            while (fileScanner.hasNextLine()) {
                if(guess.toUpperCase().equals(fileScanner.nextLine().toUpperCase())){
                  fileScanner.close();
                  return true;
                }
                  


            }
          
        } catch (FileNotFoundException e) {
            System.err.println("Word list file not found: ");
        }   
      return false;
    }
  
}
