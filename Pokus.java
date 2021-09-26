package educanet;

import java.util.Scanner;

public class Pokus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napiste text.");
        String text = sc.nextLine();

        boolean find = false;
        int pos = 0;
        int check = 0;

        if (text.charAt(0) == 'A') {
            check = 1;
        } else {
            check = 2;
        }

        switch (check) {
            case 1 -> {

                for (int x = 0; x < text.length(); x++) {
                    if (text.charAt(x) == 'A' && text.charAt(x + 1) == 'B') {
                        pos = x;
                        break;
                    }

                    for (int y = pos + 2; y < text.length(); y++) {
                        if (text.charAt(y) == 'B' && text.charAt(y + 1) == 'A') {
                            find = true;
                            break;
                        } else {
                            for (int w = 0; w < pos-1; w++) {
                                if (text.charAt(w) == 'B' && text.charAt(w + 1) == 'A') {
                                    find = true;
                                    break;
                                } else {
                                    check = 2;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            case 2 -> {
                for (int x = 0; x < text.length(); x++) {
                    if (text.charAt(x) == 'B' && text.charAt(x + 1) == 'A') {
                        pos = x;
                        break;
                    }
                    for (int y = pos + 2; y < text.length(); y++) {
                        if (text.charAt(y) == 'A' && text.charAt(y + 1) == 'B') {
                            find = true;
                            break;
                        } else {
                            for (int w = 0; w < pos - 1; w++) {
                                if (text.charAt(w) == 'A' && text.charAt(w + 1) == 'B') {
                                    find = true;
                                    break;
                                } else {
                                    check = 1;
                                    continue;
                                }
                            }
                        }
                    }
                }

                if (find) {
                    System.out.println("ANO");
                } else {
                    System.out.println("NE");
                }
            }
        }
    }
}
