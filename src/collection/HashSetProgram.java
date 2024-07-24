package collection;
import java.util.*;
import java.lang.*;
public class HashSetProgram {
	public class Comp 
	{
	   int id;
	   int dig;
	   Comp(int id,int dig)
	   {
		   this.id=id;
		   this.dig=dig;
	   }
	 public String toString()
	{
		return "Comp [id=" + id +","+dig+ "]";
	}
	public void main(String[] args){
		Set<Comp> s=new HashSet<>();
		s.add(new Comp(1,11));
		s.add(new Comp(2,22));
		s.add(new Comp(10,33));
		s.add(new Comp(-1,44));
		s.add(new Comp(-9,55));
//		Collections.sort(s);
		for(Comp c:s){
		System.out.println(c);
		}
		System.out.println("---------------------------------------------------------");
	Set<Comp> ss=new HashSet<>();	
		ss.add(new Comp(1,11));
		ss.add(new Comp(2,22));
		ss.add(new Comp(10,33));
		ss.add(new Comp(-1,44));
		ss.add(new Comp(-9,55));
		for(Comp cc:ss)
		{
		System.out.println(cc);
		}
	}
	}
}
