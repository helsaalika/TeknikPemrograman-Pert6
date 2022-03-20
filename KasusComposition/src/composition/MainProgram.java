package composition;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CPU cpu1 = new CPU("Intel", 16);
		CPU cpu2 = new CPU("AMD", 8);
		
		List<CPU> cpu = new ArrayList<CPU>();
		cpu.add(cpu1);
		cpu.add(cpu2);
		Komputer komputer = new Komputer(cpu);
		List<CPU> cp = komputer.getDataCPUKomputer();
		for(CPU c : cp){
			System.out.println("Komputer dengan Processor " + c.processor + " RAM " + c.ram + " GB");
		}

	}

}
