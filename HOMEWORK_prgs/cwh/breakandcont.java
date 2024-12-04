public class breakandcont {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==3){
                continue;
            }
            if(i==7){
                break;
            }
            System.out.println(i);
        }

        int[] elems={100,200,300,400,500,600,700};
        for(int it: elems){
            System.out.println(it);
        }
    }
}