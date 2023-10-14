package pack;

import java.util.Scanner;

public class App {
    public void shiftAlpha(StringBuilder shiftedAlpha, int key){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
        for(int i = key; i < alpha.length();i++){
            shiftedAlpha.append(alpha.charAt(i));
        }
        for(int i = 0;i < key; i++){
            shiftedAlpha.append(alpha.charAt(i));
        }
    }

    public static void main(String[] args) throws Exception {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner scan = new Scanner(System.in);

        System.out.println("enter message: ");
        String message = scan.nextLine().toUpperCase();

        System.out.print("enter key: ");
        int key = scan.nextInt();

        StringBuilder shiftedAlpha = new StringBuilder("");
        App app = new App();
        app.shiftAlpha(shiftedAlpha, key);


        StringBuilder crypted = new StringBuilder("");

        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(!(ch == ' ')){
                int index = alpha.indexOf(ch);
                crypted.append(shiftedAlpha.charAt(index));
            } else {
                crypted.append(" ");
            }
        }

        System.out.println(crypted);
    }
}
