package dependence;

public class Human {
	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void getData(Clothes cl) {
		System.out.println(name +" menggunakan baju berukuran " + cl.ukuran + " yang berwarna "+cl.warna);
	}

}
