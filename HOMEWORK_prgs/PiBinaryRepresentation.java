public class PiBinaryRepresentation {
    public static void main(String[] args) {
        float piFloat = (float) 3.14;
        double piDouble = 3.14;

        
        int floatBits = Float.floatToIntBits(piFloat);
        long doubleBits = Double.doubleToLongBits(piDouble);

      
        System.out.println("Float (3.14) in binary: " + Integer.toBinaryString(floatBits));
        System.out.println("Double (3.14) in binary: " + Long.toBinaryString(doubleBits));
    }
}


/***********OUTPUT
 * 
 * Float (3.14) in binary: 1000000010010001111010111000011
Double (3.14) in binary: 100000000001001000111101011100001010001111010111000010100011111
 * 
 * 
 * 
 * *******************/

