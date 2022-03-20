package assosiation;
import java.util.*;

public class Major {
	private String majorName;
    
    private List<course> course;

    public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public List<course> getCourse() {
        return course;
    }
    
    public void setState(List<course> course){
        this.course = course;
    }   
}

