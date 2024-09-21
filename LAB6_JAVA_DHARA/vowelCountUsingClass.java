
import java.util.Scanner;

// Lab 6 B 4 : Create a class which ask the user to enter a sentence, and it should display count of
// each vowel type in the sentence. The program should continue till user enters a word
// “quit”. Display the total count of each vowel for all sentences.
class vowelc {

    String str;

    void getSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        str = sc.nextLine();

        countVowels(str);
    }

    public void countVowels(String str) {
        int A = 0, E = 0, I = 0, O = 0, U = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A':
                    A++;
                    break;
                case 'E':
                    E++;
                    break;
                case 'I':
                    I++;
                    break;
                case 'O':
                    O++;
                    break;
                case 'U':
                    U++;
                    break;
                default:
                    System.out.println("There are no vowels in the sentence. ");
                    break;
            }

            System.out.println("Vowels in the sentence are : ");
            System.out.println("A : " + A);
            System.out.println("E : " + E);
            System.out.println("I : " + I);
            System.out.println("O : " + O);
            System.out.println("U : " + U);
        }
    }

}

class vowelCountUsingClass {

    public static void main(String[] args) {
        vowelc vc = new vowelc();
        vc.getSentence();

    }
}
