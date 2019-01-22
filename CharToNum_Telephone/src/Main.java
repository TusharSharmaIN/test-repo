import java.util.Scanner;

public class Main{
    public static int getNumber(char letter) {

        int number = 0;

        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
                        number = 2;
                        break;
            case 'D':
            case 'E':
            case 'F':
                        number = 3;
                        break;
            case 'G':
            case 'H':
            case 'I':
                        number = 4;
                        break;
            case 'J':
            case 'K':
            case 'L':
                        number = 5;
                        break;
            case 'M':
            case 'N':
            case 'O':
                        number = 6;
                        break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                        number = 7;
                        break;
            case 'T':
            case 'U':
            case 'V':
                        number = 8;
                        break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                        number = 9;
                        break;

            default :   number = -1;
                        break;
        }

        return number;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer choice;

        Character charVal;

        do {

            System.out.print("Enter a letter: ");
            charVal = sc.next().charAt(0);

            if(Character.isLowerCase(charVal))
            {
                charVal = Character.toUpperCase(charVal);
            }

            int num = getNumber(charVal);

            if(num != -1)
                System.out.println("The corresponding number is " + num);
            else
                System.out.println(charVal + " is an invalid input");

            System.out.print("Continue? (1/0): ");
            choice = sc.nextInt();

            System.out.println();

        }   while(choice == 1);
    }
}