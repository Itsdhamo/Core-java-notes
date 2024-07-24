package threads;

public class MainClass2 {
public static void main(String... args) {
	Thread t1=Thread.currentThread();
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	System.out.println(args.length);
		System.out.println(args[0] + args[1]);
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println(x+y);
}}
