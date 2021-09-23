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
            if(text.charAt(x) == 'A' && text.charAt(x + 1) == 'B'){
                pos = x;
                break;
            }
        }

        for(int y = pos+2; y < text.length(); y++){
            if(text.charAt(y) == 'B' && text.charAt(y + 1) == 'A'){
                nasel = true;
            } else {
                for(int w = 0; w < pos-1; w++){
                    if(text.charAt(w) == 'B' && text.charAt(w + 1) == 'A'){
                        nasel = true;
                    }
                }
            }
        }

        if(nasel){
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }
    }
}
