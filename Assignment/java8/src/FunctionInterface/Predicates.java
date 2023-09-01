package FunctionInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Predicates {
    //public class Predicates implements Predicate<Integer>
    /*@Override
    public boolean test(Integer i) {
        if(i%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        Predicate<Integer> p=new Predicates();
        System.out.println(p.test(10));
    }*/
    public static void main(String[] args) {
        //Predicate<Integer> p = t->t%2==0;
        List<Integer> l = Arrays.asList(23,40, 90, 88, 24);
        l.stream().filter(t->t%2==0).forEach(t -> System.out.println("print even numbers"+t));
    }
}