package kodlamaIO;

public class Instructor extends User{
	private int id;
	private String givenCourse;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGivenCourse() {
		return givenCourse;
	}
	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
}
