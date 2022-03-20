package assosiation;

public class course {
	private String courseName; 
    
    public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override 
    public String toString(){
        return courseName;
    } 

}
