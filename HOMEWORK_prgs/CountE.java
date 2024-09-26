
class CountE {

    public static void main(String[] args) {
        String str = "Welcome to DU in MCA department";
        int counte = 0;
        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case 'e':
                    counte++;
                    break;
            }
        }

        System.out.println("'e' in the string are : " + counte);
    }
}
