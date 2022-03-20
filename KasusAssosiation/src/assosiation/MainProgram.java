package assosiation;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Major major = new Major();
        major.setMajorName("Teknik Komputer dan Informatika");
        
        course course = new course();
        course.setCourseName("Teknik Pemrograman");
        course course2 = new course();
        course2.setCourseName("Proyek 1");
        
        List<course>cs = new ArrayList<course>();
        cs.add(course);
        cs.add(course2);
        
        major.setState(cs);
        
        for(course cse : cs) {
        	System.out.println(major.getMajorName()+" memiliki mata kuliah "+ cse.getCourseName());
		}

	}

}
