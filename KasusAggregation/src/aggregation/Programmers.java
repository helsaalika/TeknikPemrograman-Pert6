package aggregation;

import java.util.*;

public class Programmers {
	
	private String nameProgrammer;
	private List<ProyekProgrammer> proyek;
	
	public String getNameProgrammer() {
		return nameProgrammer;
	}

	public void setNameProgrammer(String nameProgrammer) {
		this.nameProgrammer = nameProgrammer;
	}

	Programmers(String name, List<ProyekProgrammer> proyek) {
		this.nameProgrammer = name;
		this.proyek = proyek;
	}
	
	public List<ProyekProgrammer> getProyek(){
		return proyek;
	}

}
