package aggregation;

import java.util.*;

public class SoftwareHouse {
	
	String SHName;
	private List<Programmers> programmers;
	SoftwareHouse(String SHName, List<Programmers> programmers) {
		this.SHName = SHName;
		this.programmers = programmers;
	}
	
	//menampilkan software house dan programmer serta proyek
	public void getDataSoftwareHouse() {
		List<ProyekProgrammer> proyek;
		System.out.println("\tPERUSAHAAN "+SHName);
		System.out.println("========================================");
		System.out.println("Memiliki beberapa programmer yaitu : ");
		for(Programmers programmer : programmers) {
			proyek = programmer.getProyek();
			for(ProyekProgrammer pp : proyek)
				System.out.println(programmer.getNameProgrammer() + " mengerjakan projek "+ pp.getNameProyek());
		}
	}

}
