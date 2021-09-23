package educanet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napiste text.");
        String text = sc.nextLine();

        boolean nasel = false;
        int pos = 0;

        for(int x = 0; x < text.length(); x++){
            if(text.substring(x, x+1).equals("B") && text.substring(x+1, x+2).equals("A")){
                pos = x;
            }
        }

        for(int y = pos; y < text.length(); y++){
            if (text.substring(y, y+1).equals("B") && text.substring(y+1, y+2).equals("A")) {
                nasel = true;
            }
        }

        if(nasel){
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }
    }
}
