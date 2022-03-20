package aggregation;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProyekProgrammer pp1 = new ProyekProgrammer("Aplikasi Desktop");
		ProyekProgrammer pp2 = new ProyekProgrammer("Aplikasi Android");
		
		List <ProyekProgrammer> proyekprogrammer1 = new ArrayList<ProyekProgrammer>();
		proyekprogrammer1.add(pp1);
		
		List <ProyekProgrammer> proyekprogrammer2 = new ArrayList<ProyekProgrammer>();
		proyekprogrammer2.add(pp2);
		
		Programmers desktop = new Programmers("Helsa", proyekprogrammer1);
		Programmers android = new Programmers("Alika", proyekprogrammer2);
		List <Programmers> programmer = new ArrayList<Programmers>();
		programmer.add(desktop);
		programmer.add(android);
		
		// creating an instance
		SoftwareHouse sh = new SoftwareHouse("MICROSOFT", programmer);
		sh.getDataSoftwareHouse();

	}

}
