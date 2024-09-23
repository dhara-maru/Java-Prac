
import java.util.Scanner;

class vowelc {

    int a, e, iv, o, u;

    void getstring() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            a = 0;
            e = 0;
            iv = 0;
            o = 0;
            u = 0;
            System.out.print("Enter quit to exit : ");
            String str = sc.nextLine();

            if (str.equals("quit")) {
                break;
            } else {

                for (int i = 0; i < str.length(); i++) {
                    switch (str.charAt(i)) {
                        case 'a':
                            a++;
                            break;
                        case 'e':
                            e++;
                            break;
                        case 'i':
                            iv++;
                            break;
                        case 'o':
                            o++;
                            break;
                        case 'u':
                            u++;
                            break;
                        // default:
                        //     System.out.println("No vowel found!");
                        //     break;

                    }
                }
            }

            System.out.println("a are : " + a);
            System.out.println("e are : " + e);
            System.out.println("i are : " + iv);
            System.out.println("o are : " + o);
            System.out.println("u are : " + u);
        }//while loop

    }

}

class vowelCountUsingClass {

    public static void main(String[] args) {
        vowelc v1 = new vowelc();
        v1.getstring();

    }

}
