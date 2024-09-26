
class oddevencase {

    public static void main(String[] args) {
        String str = "darshan";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i % 2 == 0) {
                result += Character.toUpperCase(ch);
            } else {
                result += Character.toLowerCase(ch);
            }
        }

        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }

        System.out.println();
    }
}
