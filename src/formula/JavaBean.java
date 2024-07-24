package formula;
public class JavaBean {
		private int id;
		private String name;
		private double salary;
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public double getSalary(){
			return salary;
		}
		public void setSalary(double salary){
			this.salary = salary;
		}
		public static void main(String[] args){
		JavaBean j=new JavaBean();
		j.setId(4006);
		j.setName("Dhamodaran");
		j.setSalary(500000.0);
		System.out.println(j.getId());
		System.out.println(j.getName());
		System.out.println(j.getSalary());
		}
	}


