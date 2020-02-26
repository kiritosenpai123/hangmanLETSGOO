package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"germany", "japan", "bulgaria", "england", "serbia"};

        System.out.println("Enter 1 for singleplayer and 2 for multiplayer");
        int choice = input.nextInt();
        if (choice == 1) {
            singleplayerRules(choice, array);
        } else if (choice == 2) {
            multiplayerRules(choice, array);
        } else {
            System.out.println("Error! Please enter either 1 or 2");
        }

    }

    public static void singleplayerRules(int choice, String[] array) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();


        String word = array[r.nextInt(array.length)];
        int count = word.length();
        char[] CharrArr = word.toCharArray();
        char[] dash = word.toCharArray();

        for (int i = 0; i < dash.length; i++) {
            dash[i] = '_';
            System.out.print(dash[i] + " ");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Try to guess a letter! ");
            char letter = input.next().charAt(0);

            for (int j = 0; j < CharrArr.length; j++) {
                if (letter == dash[j]) {
                    System.out.println("This letter already exists");
                    System.out.println();

                } else {
                    if (letter == CharrArr[j]) {
                        dash[j] = letter;
                        i--;
                        System.out.println("Correct guess!");
                        System.out.println();
                    }
                }
            }
            System.out.println(dash);
            switch (i) {
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println("|");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 4:
                    System.out.println();
                    System.out.println(" _");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 5:
                    System.out.println();
                    System.out.println(" __");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 6:
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 7:
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 8:
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|   O");
                    System.out.println("|");
                    break;
                case 9:
                    System.out.println(" ___");
                    System.out.println("|   O");
                    System.out.println("|  \\ /");
                    System.out.println("|  ");
                    break;
                case 10:
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|   O");
                    System.out.println("|  \\ /");
                    System.out.println("|  / \\");
                    System.out.println("You're out!!");
                    break;
            }
            System.out.print("");

            if ((new String(word)).equals(new String(dash))) {
                System.out.println("Congratulations! YOU WIN! \n");
                break;
            }
        }
    }

    public static void multiplayerRules(int choice, String[] array) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        String word = array[r.nextInt(array.length)];
        int count = word.length();
        char[] CharrArray = word.toCharArray();
        char[] dash = word.toCharArray();

        System.out.println("Please enter your names ladies/gentlemen!");
        System.out.println("The first one now !");
        String playerName1 = input.nextLine();
        System.out.println("And now the second!");
        String playerName2 = input.nextLine();

        for (int i = 0; i < dash.length; i++) {
            dash[i] = '_';
            System.out.print(dash[i] + " ");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Try to guess a letter! ");
            char letter = input.next().charAt(0);
            for (int j = 0; j < CharrArray.length; j++) {
                if (letter == CharrArray[j]) {
                    dash[j] = letter;
                    i--;
                    System.out.println("Correct guess! GO on!");
                    System.out.println();
                }
            }
            System.out.println(dash);
            switch (i) {
                case 1:
                    for (int k = 0; i < dash.length; k++) {
                        dash[k] = '_';
                        System.out.print(dash[k] + " ");
                    }
                    for (int l = 1; l <= 10; l++) {
                        System.out.println("Try to guess a letter! ");
                        char letterFor2ndPlayer = input.next().charAt(0);
                        for (int j = 0; j < CharrArray.length; j++) {
                            if (letter == CharrArray[j]) {
                                dash[j] = letter;
                                i--;
                                System.out.println("Correct guess! GO on!");
                                System.out.println();
                            }


                        }
                    }
            }
        }
    }
}

//
//        String secretWord = input.nextLine();
//        for (int i = 0; i <= 20; i++) {
//            System.out.println();
//            char letter;
//        }
//        System.out.println("Word to date: ");
//        for (int j = 0; j < secretWord.length(); j++) {
//            System.out.print("-");
//        }
//        while (attempts <= 10 && attempts > 0) {
//            System.out.println("\n Attempts left: " + attempts);
//            System.out.println("Enter a letter: ");
//            attempts--;
//        }
//        System.out.println("\n --------------------");
//        System.out.println("Sorry but you didnt guess the word!");
//        System.out.println("The secret word was \"" + secretWord + "\"");
//
//    }
//}
