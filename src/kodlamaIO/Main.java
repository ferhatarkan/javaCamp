package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setFirstName("ferhat");
		user.setLastName("arkan");
		user.setEmail("ferhat@arkan");
		user.setPassword("12345");
		UserManager userManager = new UserManager();
		userManager.add(user);
	}

}
