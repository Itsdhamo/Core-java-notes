package extra;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class MainClass4 {
public static void main(String[] args) {
	Predicate<String> p1=(n) -> n.length()>0;
	System.out.println(p1.test("leo"));
	Consumer<Integer> c1=(n) -> System.out.println(n*n*n);
	c1.accept(3);
	Function<String, String> f1=(a) -> a+"dhamodaran";
	System.out.println(f1.apply("dhamodaran"));
}
}
