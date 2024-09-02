public class toBinaryString {
    public static void main(String[] args) {

        System.out.println(" 1 : " + Integer.toBinaryString(1));
        System.out.println(" -1 : " + Integer.toBinaryString(-1));

        System.out.println(" -1 >> 16 : " + Integer.toBinaryString(-1 >> 16));
        System.out.println(" -1 >>> 16 : " + Integer.toBinaryString(-1 >>> 16));
    }
}
