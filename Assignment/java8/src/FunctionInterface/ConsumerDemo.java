package FunctionInterface;
import java.util.function.Consumer;
public class ConsumerDemo {

    public static void main(String []args){
       Consumer<Integer>consumer=(t)->{
           System.out.println("printing: "+t);
       } ;
       consumer.accept(10);
    }
}
