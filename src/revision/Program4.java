package revision;

public class Program4 {
public static void main(String[] args) {
String s1=new String("manonmani");
String s2=new String("manonmani");
String s3="manonmani";
String s4="manonmani";
char [] arr= {'m','a','n','o','n','m','a','n','i'};
System.out.println(arr.equals(s3));
System.out.println(s1==s2);
System.out.println(s2==s3);
System.out.println(s3==s4);
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3));
System.out.println(s3.equals(s4));
}
}
