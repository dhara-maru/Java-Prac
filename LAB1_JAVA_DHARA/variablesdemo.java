import java.util.*;
class variablesdemo{
    public static void main(String a[]){
        int n1=Integer.parseINT(a[0]);
        int n2=Integer.parseINT(a[1]);
        int add = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;

        System.out.println("sum : "+add);
        System.out.println("sub : "+sub);
        System.out.println("mul : "+mul);
        System.out.println("div : "+div);
    }
}