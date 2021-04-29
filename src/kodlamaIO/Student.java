package kodlamaIO;

public class Student extends User{
	int id;
	String[] registeredCourses;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(String[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
}
