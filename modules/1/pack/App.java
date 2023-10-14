package pack;

import java.util.Scanner;

class Reverse {
    public String reverse(String s) {
        String rev = "";
        
        for(int i = 0; i < s.length(); i++){
            rev = s.charAt(i) + rev;
        }

        return rev;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        String s = "";

        try (Scanner scan = new Scanner(System.in)) {
            while(true){
                Reverse rev = new Reverse();

                System.out.print("Enter string: ");

                s = scan.nextLine();

                if(s == "quit"){
                    break;
                }
                
                System.out.println(rev.reverse(s));
            }
        }
        
    }
}
