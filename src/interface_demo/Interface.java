package interface_demo;

interface WaterResources {
	void ocean();

	void river();

	void lake();
}

class WR implements WaterResources {
	public void ocean() {
		System.out.println("big water resource");
	}

	public void river() {
		System.out.println("linked with sea");
	}

	public void lake() {
		System.out.println("its just a independent water and rain water");
	}
}

class Water implements WaterResources {
	public void ocean() {
		System.out.println("ocean water");
	}

	public void river() {
		System.out.println("river water");
	}

	public void lake() {
		System.out.println("lake water");
	}
}

public class Interface {
	public static void main(String[] args) {
		WaterResources wr = new WR();
		Water w = new Water();
		wr.ocean();
		wr.river();
		wr.lake();
		System.out.println("--------------");
		w.ocean();
		w.lake();
		w.river();
	}

}
