package kodlamaIO;

public class InstructorManager extends UserManager{
	

	public void add(User user) {
		System.out.println("Instructor "+ user.getFirstName() +" " + user.getLastName() +" added.");
	}
}
