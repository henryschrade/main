//was not written by me
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

class printWithColor{
  
    //These variables are written in all upper case because they dont change

  
  public static void print(String letter, String color){
    String ANSI_RESET = "\u001B[0m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_GRAY = "\u001B[90m";

    String BLACK = "\u001B[30m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String WHITE = "\u001B[37m";
    
    StringBuilder feedback = new StringBuilder();
    if(color.toLowerCase().equals("green")){
      System.out.print(feedback.append(ANSI_GREEN).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("yellow")){
      System.out.print(feedback.append(ANSI_YELLOW).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("gray")){
      System.out.print(feedback.append(ANSI_GRAY).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("blue")){
      System.out.print(feedback.append(BLUE).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("black")){
      System.out.print(feedback.append(BLACK).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("purple")){
      System.out.print(feedback.append(PURPLE).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("cyan")){
      System.out.print(feedback.append(CYAN).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("white")){
      System.out.print(feedback.append(WHITE).append(letter).append(ANSI_RESET));
    }else{
      System.out.println("invalid color + " + color);
    }
    
  }
  public static void println(String letter, String color){
    String ANSI_RESET = "\u001B[0m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_GRAY = "\u001B[90m";
           
    String BLACK = "\u001B[30m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String WHITE = "\u001B[37m";
    
    StringBuilder feedback = new StringBuilder();
    if(color.toLowerCase().equals("green")){
      System.out.println(feedback.append(ANSI_GREEN).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("yellow")){
      System.out.println(feedback.append(ANSI_YELLOW).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("gray")){
      System.out.println(feedback.append(ANSI_GRAY).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("blue")){
      System.out.println(feedback.append(BLUE).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("black")){
      System.out.println(feedback.append(BLACK).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("purple")){
      System.out.println(feedback.append(PURPLE).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("cyan")){
      System.out.println(feedback.append(CYAN).append(letter).append(ANSI_RESET));
    }else if(color.toLowerCase().equals("white")){
      System.out.println(feedback.append(WHITE).append(letter).append(ANSI_RESET));
    }else{
      System.out.println("invalid color + " + color);
    }
    
  }
  
}
