package FunctionInterface;

public class Test {
    public static void main(String []args){
        Addable a1=(a,b)->(a+b+b);
        System.out.println(a1.add(19,10));

        Addable a2=(a,b)->(a-b);
        System.out.println(a2.add(19,10));

        Addable a3=(a,b)->(a*b);
        System.out.println(a3.add(19,10));

        Addable a4=(a,b)->(a/b);
        System.out.println(a4.add(19,10));

    }
}
