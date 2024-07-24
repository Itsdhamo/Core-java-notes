package extra;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class MainClass3 {
 public static void main(String[] args) {
	Predicate<String> p1=(n) -> n.length()>0;
	System.out.println(p1.test("dhamodaran"));
}
}
