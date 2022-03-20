package composition;

import java.util.*;

public class Komputer {
	
	private final List<CPU> cpu;
	Komputer (List<CPU> cpu) {
		this.cpu = cpu;
	}
	
	public List<CPU> getDataCPUKomputer(){
		return cpu;
	}

}
