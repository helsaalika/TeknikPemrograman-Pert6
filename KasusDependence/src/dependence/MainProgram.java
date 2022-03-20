package dependence;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clothes cl1 = new Clothes("Biru", 'S');
		Clothes cl2 = new Clothes("Merah", 'M');
		
		Human hm1 = new Human("Helsa");
		Human hm2 = new Human("Alika");
		
		hm1.getData(cl1);
		hm2.getData(cl2);

	}

}
