package kodlamaIO;

public class StudentManager extends UserManager{
	

	public void add(User user) {
		System.out.println("Kursa kaydedildi:" + user.getEmail());
	}
}
