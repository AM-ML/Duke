package pack;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String test = "ABCabc0123456789`;#!";

        Scanner scan = new Scanner(System.in);

        System.out.print("enter a sentence: ");
        
        test = scan.nextLine();

        for(int i = 0; i < test.length(); i++){
            char ch = test.charAt(i);

            if(Character.isDigit(ch))
                System.out.println(ch + " is a digit.");
            else if (Character.isAlphabetic(ch))
                System.out.println(ch + " is Alphabetic");
            else if(!Character.isWhitespace(ch))
                System.out.println(ch + " is a punctuation.");
        }
    }
}
